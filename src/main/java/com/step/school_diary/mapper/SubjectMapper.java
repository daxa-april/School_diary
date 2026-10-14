package com.step.school_diary.mapper;

import com.step.school_diary.model.dto.requestDto.SubjectDto;
import com.step.school_diary.model.dto.responseDto.SubjectResponseDto;
import com.step.school_diary.model.entity.Subject;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Daria Pevets
 **/
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SubjectMapper {

    SubjectResponseDto mapSubjectToSubjectResponseDto(Subject subject);

    Subject mapSubjectDtoToSubject(SubjectDto subjectDto);
}
