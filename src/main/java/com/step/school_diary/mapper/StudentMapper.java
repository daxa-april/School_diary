package com.step.school_diary.mapper;

import com.step.school_diary.model.dto.requestDto.StudentDto;
import com.step.school_diary.model.dto.responseDto.StudentResponseDto;
import com.step.school_diary.model.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Daria Pevets
 **/
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface StudentMapper {

    StudentResponseDto mapStudentToStudentResponseDto(Student student);

    Student mapStudentDtoToStudent(StudentDto studentDto);
}
