package com.step.school_diary.service;

import com.step.school_diary.model.dto.requestDto.StudentDto;
import com.step.school_diary.model.dto.responseDto.StudentResponseDto;
import org.springframework.stereotype.Service;

/**
 * @author Daria Pevets
 **/
@Service
public interface StudentService {

    StudentResponseDto getStudent(Long id);

    StudentResponseDto saveStudent(StudentDto studentDto);
}
