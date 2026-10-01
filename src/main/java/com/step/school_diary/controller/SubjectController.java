package com.step.school_diary.controller;

import com.step.school_diary.model.entity.Subject;
import com.step.school_diary.repository.SubjectRepository;
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

    private final SubjectRepository subjectRepository;

    @PostMapping
    public Subject addSubject(@RequestBody Subject subject) {
        return subjectRepository.save(subject);
    }
}
