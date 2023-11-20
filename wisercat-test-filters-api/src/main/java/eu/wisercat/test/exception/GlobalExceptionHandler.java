package eu.wisercat.test.exception;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public ErrorResponse handleServiceException(HttpServletResponse response, ServiceException ex) {
        response.setStatus(ex.getHttpStatusCode());
        return new ErrorResponse(ex.getMessage(), ex.getErrorCode());
    }
}
