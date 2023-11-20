package eu.wisercat.test.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import eu.wisercat.test.exception.InvalidEnumException;

/**
 * Parameter of a filter criteria based on type
 */
public enum CriteriaParameter {
  
  MORE("More"),
  
  LESS("Less"),
  
  FROM("From"),
  
  TO("To"),
  
  STARTS_WITH("Starts with"),
  
  ENDS_WITH("Ends with");

  private String value;

  CriteriaParameter(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CriteriaParameter fromValue(String text) {
    for (CriteriaParameter b : CriteriaParameter.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }

    String enumName = CriteriaParameter.class.getSimpleName();
    if (enumName.endsWith("Enum")) {
      enumName = enumName.substring(0, enumName.lastIndexOf("Enum"));
    }

    throw new InvalidEnumException(String.format("Invalid %s value: %s. Allowed values are - %s", enumName, text, Arrays.toString(values())));
  }
}

