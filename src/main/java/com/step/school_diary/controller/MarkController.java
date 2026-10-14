package com.step.school_diary.controller;

import com.step.school_diary.model.dto.responseDto.MarkResponseDto;
import com.step.school_diary.service.MarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daria Pevets
 **/
@RequiredArgsConstructor
@RestController("/api/marks/")
public class MarkController {

    private final MarkService markService;

    @PostMapping("/newMark")
    public MarkResponseDto save(@RequestParam Long studentId, @RequestParam Long subjectId, @RequestParam Integer value) {
        return markService.save(studentId, subjectId, value);
    }
}
