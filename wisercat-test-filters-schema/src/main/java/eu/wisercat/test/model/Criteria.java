package eu.wisercat.test.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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

@Schema(name = "criteria", description = "Filters criteria")
@JsonTypeName("criteria")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-06T17:57:25.474745200+02:00[Europe/Tallinn]")
public class Criteria {

  private Integer criteriaId;

  private String criteriaName;

  public Criteria criteriaId(Integer criteriaId) {
    this.criteriaId = criteriaId;
    return this;
  }

  /**
   * Id of a filter criteria
   * @return criteriaId
  */
  
  @Schema(name = "criteriaId", description = "Id of a filter criteria", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("criteriaId")
  public Integer getCriteriaId() {
    return criteriaId;
  }

  public void setCriteriaId(Integer criteriaId) {
    this.criteriaId = criteriaId;
  }

  public Criteria criteriaName(String criteriaName) {
    this.criteriaName = criteriaName;
    return this;
  }

  /**
   * Name of a filter criteria
   * @return criteriaName
  */
  
  @Schema(name = "criteriaName", description = "Name of a filter criteria", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("criteriaName")
  public String getCriteriaName() {
    return criteriaName;
  }

  public void setCriteriaName(String criteriaName) {
    this.criteriaName = criteriaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Criteria criteria = (Criteria) o;
    return Objects.equals(this.criteriaId, criteria.criteriaId) &&
        Objects.equals(this.criteriaName, criteria.criteriaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteriaId, criteriaName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Criteria {\n");
    sb.append("    criteriaId: ").append(toIndentedString(criteriaId)).append("\n");
    sb.append("    criteriaName: ").append(toIndentedString(criteriaName)).append("\n");
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

