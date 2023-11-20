package eu.wisercat.test.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ErrorResponse {

    @JsonProperty("errorMessage")
    private String errorMessage;

    @JsonProperty("errorCode")
    private String errorCode;

    public ErrorResponse(String errorMessage, ServiceErrorCode code) {
        this.errorMessage = errorMessage;
        this.errorCode = code.name();
    }

    @JsonIgnore
    public String getMessage() {
        return errorMessage;
    }

    @JsonIgnore
    public String getCode() {
        return errorCode;
    }
}
