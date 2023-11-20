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
 * Response in case of an error (HTTP status code not 200)
 */

@Schema(name = "errorResponse", description = "Response in case of an error (HTTP status code not 200)")
@JsonTypeName("errorResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-16T13:43:47.298280500+02:00[Europe/Tallinn]")
public class ErrorResponse {

  private String errorMessage;

  private String errorCode;

  public ErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorResponse(String errorMessage, String errorCode) {
    this.errorMessage = errorMessage;
    this.errorCode = errorCode;
  }

  public ErrorResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * In case of error - detailed error message
   * @return errorMessage
  */
  @NotNull 
  @Schema(name = "errorMessage", example = "Something went wrong", description = "In case of error - detailed error message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ErrorResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * In case of error - error code
   * @return errorCode
  */
  @NotNull 
  @Schema(name = "errorCode", example = "INTERNAL_SERVER_ERROR", description = "In case of error - error code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.errorMessage, errorResponse.errorMessage) &&
        Objects.equals(this.errorCode, errorResponse.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

