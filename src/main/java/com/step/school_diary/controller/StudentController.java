package com.step.school_diary.controller;

import com.step.school_diary.exception.ResourceNotFoundException;
import com.step.school_diary.model.entity.Student;
import com.step.school_diary.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daria Pevets
 **/
@RequiredArgsConstructor
@RestController("/api/students/")
public class StudentController {

    private final StudentRepository studentRepository;

    @GetMapping
    public Student getStudent(Long id) {
        Student student = studentRepository.findById(id.intValue())
                .orElseThrow(() -> new ResourceNotFoundException("Ученик с ID " + id + " не найден"));
        studentRepository.save(student);
        return student;
        //todo: пересмотреть данную шляпу после кофе.
    }
}
