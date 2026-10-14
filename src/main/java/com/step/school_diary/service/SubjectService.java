package com.step.school_diary.service;

import com.step.school_diary.model.dto.requestDto.SubjectDto;
import com.step.school_diary.model.dto.responseDto.SubjectResponseDto;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Daria Pevets
 **/
public interface SubjectService {

    SubjectResponseDto addSubject(@RequestBody SubjectDto subjectDto);
}
