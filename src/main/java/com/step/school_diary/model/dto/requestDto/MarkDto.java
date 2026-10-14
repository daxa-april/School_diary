package com.step.school_diary.model.dto.requestDto;

import com.step.school_diary.model.entity.Student;
import com.step.school_diary.model.entity.Subject;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

import java.time.LocalDateTime;

/**
 * @author Daria Pevets
 **/
public record MarkDto(

        Integer value,
        Student student,
        Subject subject,
        LocalDateTime date
) {
}
