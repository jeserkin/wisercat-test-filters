package eu.wisercat.test.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import eu.wisercat.test.model.CriteriaItem;
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
 * Filter information response
 */

@Schema(name = "filterResponse", description = "Filter information response")
@JsonTypeName("filterResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-16T13:43:47.298280500+02:00[Europe/Tallinn]")
public class FilterResponse {

  private String filterName;

  @Valid
  private List<@Valid CriteriaItem> criteria = new ArrayList<>();

  private Integer selection;

  public FilterResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FilterResponse(List<@Valid CriteriaItem> criteria, Integer selection) {
    this.criteria = criteria;
    this.selection = selection;
  }

  public FilterResponse filterName(String filterName) {
    this.filterName = filterName;
    return this;
  }

  /**
   * Name of a filter
   * @return filterName
  */
  
  @Schema(name = "filterName", description = "Name of a filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filterName")
  public String getFilterName() {
    return filterName;
  }

  public void setFilterName(String filterName) {
    this.filterName = filterName;
  }

  public FilterResponse criteria(List<@Valid CriteriaItem> criteria) {
    this.criteria = criteria;
    return this;
  }

  public FilterResponse addCriteriaItem(CriteriaItem criteriaItem) {
    if (this.criteria == null) {
      this.criteria = new ArrayList<>();
    }
    this.criteria.add(criteriaItem);
    return this;
  }

  /**
   * Filter criteria
   * @return criteria
  */
  @NotNull @Valid 
  @Schema(name = "criteria", description = "Filter criteria", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("criteria")
  public List<@Valid CriteriaItem> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<@Valid CriteriaItem> criteria) {
    this.criteria = criteria;
  }

  public FilterResponse selection(Integer selection) {
    this.selection = selection;
    return this;
  }

  /**
   * Some random radio button selection choice
   * @return selection
  */
  @NotNull 
  @Schema(name = "selection", description = "Some random radio button selection choice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("selection")
  public Integer getSelection() {
    return selection;
  }

  public void setSelection(Integer selection) {
    this.selection = selection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterResponse filterResponse = (FilterResponse) o;
    return Objects.equals(this.filterName, filterResponse.filterName) &&
        Objects.equals(this.criteria, filterResponse.criteria) &&
        Objects.equals(this.selection, filterResponse.selection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterName, criteria, selection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterResponse {\n");
    sb.append("    filterName: ").append(toIndentedString(filterName)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
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

