package com.step.school_diary.handler;

import com.step.school_diary.exception.InvalidMarkException;
import com.step.school_diary.exception.ResourceNotFoundException;
import com.step.school_diary.exception.SubjectAlreadyExistsException;
import com.step.school_diary.model.entity.errorResponse.ErrorResponse;
import com.step.school_diary.model.entity.errorResponse.ValidationErr;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

/**
 * @author Daria Pevets
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {

    private String getRequestPath(WebRequest request) {
        return request.getDescription(false).replace("uri=", "");
    }

    @ExceptionHandler(InvalidMarkException.class)
    public ResponseEntity<ErrorResponse> handleInvalidMarkException
            (InvalidMarkException exception, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                HttpStatus.BAD_REQUEST,
                "Invalid Mark",
                exception.getMessage(),
                getRequestPath(request)
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException
            (ResourceNotFoundException exception, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND,
                "Not Found",
                exception.getMessage(),
                getRequestPath(request)
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(SubjectAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleSubjectAlreadyExistsException
            (SubjectAlreadyExistsException exception, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                HttpStatus.BAD_REQUEST,
                "Subject already exists",
                exception.getMessage(),
                getRequestPath(request)
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleUnpredictedExceptions(Exception ex) {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "На сервере произошла непредвиденная ошибка, попробуйте позже."
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationErr> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        ValidationErr validationErr = new ValidationErr(
                HttpStatus.BAD_REQUEST,
                ex.getFieldErrors()
        );
        return new ResponseEntity<>(validationErr, HttpStatus.BAD_REQUEST);
    }
}
