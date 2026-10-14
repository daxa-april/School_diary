package com.step.school_diary.model.dto.responseDto;

import com.step.school_diary.model.entity.Student;
import com.step.school_diary.model.entity.Subject;

import java.time.LocalDateTime;

/**
 * @author Daria Pevets
 **/
public record MarkResponseDto(

        Long id,
        Integer value,
        Student student,
        Subject subject,
        LocalDateTime date
) {
}
