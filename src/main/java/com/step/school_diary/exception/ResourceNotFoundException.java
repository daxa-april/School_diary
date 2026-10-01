package com.step.school_diary.exception;

import lombok.RequiredArgsConstructor;

/**
 * @author Daria Pevets
 * <p>
 * выбрасывается, если ученик или предмет с указанным ID не найдены в базе данных
 **/
@RequiredArgsConstructor
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
    }
}
