package com.step.school_diary.service;

import com.step.school_diary.model.dto.responseDto.MarkResponseDto;

/**
 * @author Daria Pevets
 **/
public interface MarkService {

    MarkResponseDto save(Long studentId, Long subjectId, Integer value);
}
