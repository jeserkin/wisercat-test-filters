package eu.wisercat.test.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import eu.wisercat.test.model.AddCriteriaItem;
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
 * Filter and related criteria addition request.
 */

@Schema(name = "addFilterRequest", description = "Filter and related criteria addition request.")
@JsonTypeName("addFilterRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-16T13:43:47.298280500+02:00[Europe/Tallinn]")
public class AddFilterRequest {

  private String name;

  @Valid
  private List<@Valid AddCriteriaItem> criteria = new ArrayList<>();

  private Integer selection;

  public AddFilterRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AddFilterRequest(String name, List<@Valid AddCriteriaItem> criteria, Integer selection) {
    this.name = name;
    this.criteria = criteria;
    this.selection = selection;
  }

  public AddFilterRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of a filter
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Name of a filter", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddFilterRequest criteria(List<@Valid AddCriteriaItem> criteria) {
    this.criteria = criteria;
    return this;
  }

  public AddFilterRequest addCriteriaItem(AddCriteriaItem criteriaItem) {
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
  public List<@Valid AddCriteriaItem> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<@Valid AddCriteriaItem> criteria) {
    this.criteria = criteria;
  }

  public AddFilterRequest selection(Integer selection) {
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
    AddFilterRequest addFilterRequest = (AddFilterRequest) o;
    return Objects.equals(this.name, addFilterRequest.name) &&
        Objects.equals(this.criteria, addFilterRequest.criteria) &&
        Objects.equals(this.selection, addFilterRequest.selection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, criteria, selection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFilterRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

