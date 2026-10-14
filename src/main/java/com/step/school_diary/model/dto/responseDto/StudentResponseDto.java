package com.step.school_diary.model.dto.responseDto;

/**
 * @author Daria Pevets
 **/
public record StudentResponseDto(

        Long id,
        String firstName,
        String lastName,
        Integer gradeLevel
) {
}
