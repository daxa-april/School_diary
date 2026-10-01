package com.step.school_diary.exception;

import lombok.AllArgsConstructor;

/**
 * @author Daria Pevets
 * <p>
 * выбрасывается, если оценка выходит за пределы диапазона 1–5.
 **/
@AllArgsConstructor
public class InvalidMarkException extends RuntimeException {
    public InvalidMarkException(String message) {
        super(message);
    }
}
