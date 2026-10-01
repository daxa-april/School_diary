package com.step.school_diary.exception;

import lombok.AllArgsConstructor;

/**
 * @author Daria Pevets
 * <p>
 * выбрасывается при попытке создать предмет, который уже существует.
 **/

public class SubjectAlreadyExistsException extends RuntimeException {
    public SubjectAlreadyExistsException(String message) {
        super(message);
    }
}
