package com.step.school_diary.controller;

import com.step.school_diary.model.dto.requestDto.StudentDto;
import com.step.school_diary.model.dto.responseDto.StudentResponseDto;
import com.step.school_diary.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author Daria Pevets
 **/
@RequiredArgsConstructor
@RestController("/api/students/")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("{id}")
    public StudentResponseDto getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/save")
    public StudentResponseDto saveStudent(@Valid @RequestBody StudentDto studentDto) {
        return studentService.saveStudent(studentDto);
    }
}
