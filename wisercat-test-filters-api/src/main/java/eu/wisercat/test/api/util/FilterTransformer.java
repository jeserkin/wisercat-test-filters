package eu.wisercat.test.api.util;

import eu.wisercat.test.model.CriteriaItem;
import eu.wisercat.test.model.CriteriaParameter;
import eu.wisercat.test.model.CriteriaType;
import eu.wisercat.test.model.FilterResponse;
import eu.wisercat.test.repository.criteria.Criteria;
import eu.wisercat.test.repository.filter.Filter;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class FilterTransformer {

    public FilterResponse toFilterResponse(Filter filter) {
        var response = new FilterResponse();
        response.setFilterName(filter.getName());
        response.setSelection(filter.getSelection());
        response.setCriteria(toCriteria(filter));
        return response;
    }

    private List<CriteriaItem> toCriteria(Filter filter) {
        return filter.getCriteria().stream()
                .map(FilterTransformer::toCriteriaItem)
                .toList();
    }

    private CriteriaItem toCriteriaItem(Criteria criteria) {
        var item = new CriteriaItem();
        item.setType(CriteriaType.valueOf(criteria.getType().name()));
        item.setParameter(CriteriaParameter.valueOf(criteria.getParameter().name()));
        item.setValue(criteria.getValue());
        return item;
    }
}
