package com.step.school_diary.model.dto.requestDto;

import jakarta.validation.constraints.NotBlank;

/**
 * @author Daria Pevets
 **/
public record SubjectDto(

        @NotBlank
        String title
) {
}
