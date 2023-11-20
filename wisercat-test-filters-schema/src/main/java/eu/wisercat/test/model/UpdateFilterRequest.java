package eu.wisercat.test.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import eu.wisercat.test.model.UpdateCriteriaItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Filter and related criteria update request.
 */

@Schema(name = "updateFilterRequest", description = "Filter and related criteria update request.")
@JsonTypeName("updateFilterRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-08T06:59:25.530620100+02:00[Europe/Tallinn]")
public class UpdateFilterRequest {

  private String filterName;

  @Valid
  private List<@Valid UpdateCriteriaItem> criteria = new ArrayList<>();

  public UpdateFilterRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateFilterRequest(String filterName, List<@Valid UpdateCriteriaItem> criteria) {
    this.filterName = filterName;
    this.criteria = criteria;
  }

  public UpdateFilterRequest filterName(String filterName) {
    this.filterName = filterName;
    return this;
  }

  /**
   * Name of a filter
   * @return filterName
  */
  @NotNull 
  @Schema(name = "filterName", description = "Name of a filter", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("filterName")
  public String getFilterName() {
    return filterName;
  }

  public void setFilterName(String filterName) {
    this.filterName = filterName;
  }

  public UpdateFilterRequest criteria(List<@Valid UpdateCriteriaItem> criteria) {
    this.criteria = criteria;
    return this;
  }

  public UpdateFilterRequest addCriteriaItem(UpdateCriteriaItem criteriaItem) {
    if (this.criteria == null) {
      this.criteria = new ArrayList<>();
    }
    this.criteria.add(criteriaItem);
    return this;
  }

  /**
   * Get criteria
   * @return criteria
  */
  @NotNull @Valid 
  @Schema(name = "criteria", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("criteria")
  public List<@Valid UpdateCriteriaItem> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<@Valid UpdateCriteriaItem> criteria) {
    this.criteria = criteria;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFilterRequest updateFilterRequest = (UpdateFilterRequest) o;
    return Objects.equals(this.filterName, updateFilterRequest.filterName) &&
        Objects.equals(this.criteria, updateFilterRequest.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterName, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFilterRequest {\n");
    sb.append("    filterName: ").append(toIndentedString(filterName)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

