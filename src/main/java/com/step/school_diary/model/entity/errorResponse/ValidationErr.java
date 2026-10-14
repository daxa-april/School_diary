package com.step.school_diary.model.entity.errorResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * @author Daria Pevets
 **/
@Setter
@Getter
@AllArgsConstructor
public class ValidationErr {

    private HttpStatus status;
    private List<FieldError> fields;
}
