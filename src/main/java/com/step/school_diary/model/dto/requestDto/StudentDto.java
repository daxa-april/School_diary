package com.step.school_diary.model.dto.requestDto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

/**
 * @author Daria Pevets
 **/
public record StudentDto(

        @NotBlank
        String firstName,

        @NotBlank
        String lastName,

        @Min(value = 1)
        @Max(value = 11)
        Integer gradeLevel
) {
}
