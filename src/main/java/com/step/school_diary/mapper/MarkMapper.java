package com.step.school_diary.mapper;

import com.step.school_diary.model.dto.requestDto.MarkDto;
import com.step.school_diary.model.dto.responseDto.MarkResponseDto;
import com.step.school_diary.model.entity.Mark;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Daria Pevets
 **/
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface MarkMapper {

    MarkDto mapMarkToMarkDto(Mark mark);

    MarkResponseDto mapMarkToMarkResponseDto(Mark mark);
}
