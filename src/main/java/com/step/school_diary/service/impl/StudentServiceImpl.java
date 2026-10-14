package com.step.school_diary.service.impl;

import com.step.school_diary.exception.ResourceNotFoundException;
import com.step.school_diary.mapper.StudentMapper;
import com.step.school_diary.model.dto.requestDto.StudentDto;
import com.step.school_diary.model.dto.responseDto.StudentResponseDto;
import com.step.school_diary.model.entity.Student;
import com.step.school_diary.repository.StudentRepository;
import com.step.school_diary.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Daria Pevets
 **/
@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public StudentResponseDto getStudent(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student with ID " + id + " not found"));
        return studentMapper.mapStudentToStudentResponseDto(student);
    }

    @Override
    public StudentResponseDto saveStudent(StudentDto studentDto) {
        Student student = studentMapper.mapStudentDtoToStudent(studentDto);
        studentRepository.save(student);
        return studentMapper.mapStudentToStudentResponseDto(student);
    }
}
