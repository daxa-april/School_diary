package com.step.school_diary.model.dto.requestDto;

import com.step.school_diary.model.annotation.SubjectValid;

/**
 * @author Daria Pevets
 **/
public record SubjectDto(

        @SubjectValid
        String title
) {
}
