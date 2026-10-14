package com.step.school_diary.model.annotation;

import com.step.school_diary.validator.SubjectValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Daria Pevets
 **/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SubjectValidator.class)
public @interface SubjectValid {

    String message() default "Предмет уже существует или вы оставили поле имени пустым";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
