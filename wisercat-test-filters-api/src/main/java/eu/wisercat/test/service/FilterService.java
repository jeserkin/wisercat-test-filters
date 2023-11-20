package eu.wisercat.test.service;

import eu.wisercat.test.api.util.FilterTransformer;
import eu.wisercat.test.exception.ServiceErrorCode;
import eu.wisercat.test.exception.ServiceException;
import eu.wisercat.test.model.AddCriteriaItem;
import eu.wisercat.test.model.AddFilterRequest;
import eu.wisercat.test.model.CriteriaParameter;
import eu.wisercat.test.model.CriteriaType;
import eu.wisercat.test.model.FilterResponse;
import eu.wisercat.test.repository.criteria.Criteria;
import eu.wisercat.test.repository.filter.Filter;
import eu.wisercat.test.repository.filter.FilterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FilterService {

    private final FilterRepository filterRepository;

    public FilterResponse addFilter(AddFilterRequest request) {
        Filter newFilter = createFilter(request);
        List<Criteria> criteria = createCriteria(request, newFilter);
        newFilter.setCriteria(criteria);
        filterRepository.save(newFilter);
        return getFilterById(Long.valueOf(newFilter.getId()).intValue());
    }

    public List<FilterResponse> getFilters() {
        return filterRepository.findAll().stream()
                .map(FilterTransformer::toFilterResponse)
                .toList();
    }

    private static Filter createFilter(AddFilterRequest request) {
        var filter = new Filter();
        filter.setName(request.getName());
        filter.setSelection(request.getSelection());
        return filter;
    }

    private FilterResponse getFilterById(int filterId) {
        Optional<Filter> filter = filterRepository.findById(filterId);

        if (filter.isPresent()) {
            return FilterTransformer.toFilterResponse(filter.get());
        }

        throw new ServiceException(ServiceErrorCode.FILTER_NOT_FOUND, "missing");
    }

    private static List<Criteria> createCriteria(AddFilterRequest request, Filter filter) {
        return request.getCriteria().stream()
                .map(item -> createCriteriaItem(item, filter))
                .toList();
    }

    private static Criteria createCriteriaItem(AddCriteriaItem item, Filter filter) {
        var criteria = new Criteria();
        criteria.setFilter(filter);
        criteria.setType(toCriteriaType(item.getType()));
        criteria.setParameter(toCriteriaParameter(item.getParameter()));
        criteria.setValue(item.getValue());
        return criteria;
    }

    private static Criteria.Type toCriteriaType(CriteriaType type) {
        return switch (type) {
            case AMOUNT -> Criteria.Type.AMOUNT;
            case TITLE -> Criteria.Type.TITLE;
            case DATE -> Criteria.Type.DATE;
        };
    }

    private static Criteria.Parameter toCriteriaParameter(CriteriaParameter parameter) {
        return switch (parameter) {
            case MORE -> Criteria.Parameter.MORE;
            case LESS -> Criteria.Parameter.LESS;
            case FROM -> Criteria.Parameter.FROM;
            case TO -> Criteria.Parameter.TO;
            case STARTS_WITH -> Criteria.Parameter.STARTS_WITH;
            case ENDS_WITH -> Criteria.Parameter.ENDS_WITH;
        };
    }
}
