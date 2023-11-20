package eu.wisercat.test.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import eu.wisercat.test.model.CriteriaParameter;
import eu.wisercat.test.model.CriteriaType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Filters criteria
 */

@Schema(name = "criteriaItem", description = "Filters criteria")
@JsonTypeName("criteriaItem")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-16T13:43:47.298280500+02:00[Europe/Tallinn]")
public class CriteriaItem {

  private CriteriaType type;

  private CriteriaParameter parameter;

  private String value;

  public CriteriaItem type(CriteriaType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public CriteriaType getType() {
    return type;
  }

  public void setType(CriteriaType type) {
    this.type = type;
  }

  public CriteriaItem parameter(CriteriaParameter parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * Get parameter
   * @return parameter
  */
  @Valid 
  @Schema(name = "parameter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameter")
  public CriteriaParameter getParameter() {
    return parameter;
  }

  public void setParameter(CriteriaParameter parameter) {
    this.parameter = parameter;
  }

  public CriteriaItem value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of a given criteria
   * @return value
  */
  
  @Schema(name = "value", description = "Value of a given criteria", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CriteriaItem criteriaItem = (CriteriaItem) o;
    return Objects.equals(this.type, criteriaItem.type) &&
        Objects.equals(this.parameter, criteriaItem.parameter) &&
        Objects.equals(this.value, criteriaItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parameter, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CriteriaItem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

