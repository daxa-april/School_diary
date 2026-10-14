package com.step.school_diary.controller;

import com.step.school_diary.model.dto.requestDto.SubjectDto;
import com.step.school_diary.model.dto.responseDto.SubjectResponseDto;
import com.step.school_diary.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daria Pevets
 **/
@RequiredArgsConstructor
@RestController("/api/subjects/")
public class SubjectController {

    private final SubjectService subjectService;

    @PostMapping("/newSubject")
    public SubjectResponseDto addSubject(@RequestBody SubjectDto subjectDto) {
        return subjectService.addSubject(subjectDto);
    }
}
