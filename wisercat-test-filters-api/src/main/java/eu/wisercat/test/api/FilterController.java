package eu.wisercat.test.api;

import eu.wisercat.test.model.AddFilterRequest;
import eu.wisercat.test.model.FilterResponse;
import eu.wisercat.test.service.FilterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FilterController implements FilterApi {

    private final FilterService filterService;

    @Override
    public ResponseEntity<FilterResponse> addFilter(AddFilterRequest request) {
        return ResponseEntity.ok(filterService.addFilter(request));
    }

    @Override
    public ResponseEntity<List<FilterResponse>> getFilters() {
        return ResponseEntity.ok(filterService.getFilters());
    }
}
