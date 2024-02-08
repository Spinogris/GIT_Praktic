package com.lab.rmtbanking.creditservice.controller;

import com.lab.rmtbanking.creditservice.dto.ErrorExtension;
import com.lab.rmtbanking.creditservice.dto.ErrorResponse;
import com.lab.rmtbanking.creditservice.exception.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.net.ConnectException;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorResponse> handleConstraintViolationException(ConstraintViolationException exception) {
        List<ErrorExtension> extensions = exception.getConstraintViolations()
                .stream()
                .map(violation -> new ErrorExtension(violation.getMessage(), ErrorCode.INVALID_PATH_VARIABLE))
                .collect(Collectors.toList());
        return new ResponseEntity<>(new ErrorResponse(ErrorCode.VALIDATION_FAILED, extensions), BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request) {
        List<ErrorExtension> errorExtensions = exception.getFieldErrors()
                .stream()
                .map(filedError -> new ErrorExtension(filedError.getDefaultMessage(),
                        String.format("invalid_%s", filedError.getField())))
                .collect(Collectors.toList());
        return new ResponseEntity<>(new ErrorResponse(ErrorCode.VALIDATION_FAILED, errorExtensions), BAD_REQUEST);
    }

    @ExceptionHandler(ConnectException.class)
    public ResponseEntity<ErrorExtension> handleConnectException() {
        ErrorExtension body = new ErrorExtension(
                ErrorMessage.TEMPORARY_UNAVAILABLE,
                SERVICE_UNAVAILABLE.name().toLowerCase());
        return new ResponseEntity<>(body, SERVICE_UNAVAILABLE);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorExtension> handleProductNotFoundException(Exception ex) {
        ErrorExtension body = new ErrorExtension(
                ex.getMessage(),
                ErrorCode.PRODUCT_NOT_FOUND);
        return new ResponseEntity<>(body, NOT_FOUND);
    }

    @ExceptionHandler(CreditNotFoundException.class)
    public ResponseEntity<ErrorExtension> handleCreditNotFoundException(Exception exception) {
        ErrorExtension body = new ErrorExtension(
                exception.getMessage(),
                ErrorCode.CREDIT_NOT_FOUND);
        return new ResponseEntity<>(body, NOT_FOUND);
    }

    @ExceptionHandler(CreditOrderDeleteException.class)
    public ResponseEntity<ErrorExtension> handleCreditOrderDeleteException(Exception ex) {
        ErrorExtension body = new ErrorExtension(
                ex.getMessage(),
                ErrorCode.CREDIT_ORDER_STATUS);
        return new ResponseEntity<>(body, BAD_REQUEST);
    }

    @ExceptionHandler(NearestPaymentNotFoundException.class)
    public ResponseEntity<ErrorExtension> handleNearestPayementNotFound(Exception ex) {
        ErrorExtension body = new ErrorExtension(
                ex.getMessage(),
                ErrorCode.PAYMENT_NOT_FOUND);
        return new ResponseEntity<>(body, NOT_FOUND);
    }
}