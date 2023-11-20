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
 * Type of a filter criteria
 */
public enum CriteriaType {
  
  AMOUNT("Amount"),
  
  TITLE("Title"),
  
  DATE("Date");

  private String value;

  CriteriaType(String value) {
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
  public static CriteriaType fromValue(String text) {
    for (CriteriaType b : CriteriaType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }

    String enumName = CriteriaType.class.getSimpleName();
    if (enumName.endsWith("Enum")) {
      enumName = enumName.substring(0, enumName.lastIndexOf("Enum"));
    }

    throw new InvalidEnumException(String.format("Invalid %s value: %s. Allowed values are - %s", enumName, text, Arrays.toString(values())));
  }
}

