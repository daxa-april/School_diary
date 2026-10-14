package com.step.school_diary.service.impl;

import com.step.school_diary.exception.SubjectAlreadyExistsException;
import com.step.school_diary.mapper.SubjectMapper;
import com.step.school_diary.model.dto.requestDto.SubjectDto;
import com.step.school_diary.model.dto.responseDto.SubjectResponseDto;
import com.step.school_diary.model.entity.Subject;
import com.step.school_diary.repository.SubjectRepository;
import com.step.school_diary.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Daria Pevets
 **/
@RequiredArgsConstructor
@Service
public class SubjectServiceImpl implements SubjectService {

    private final SubjectMapper subjectMapper;
    private final SubjectRepository subjectRepository;

    @Override
    public SubjectResponseDto addSubject(SubjectDto subjectDto) {
        Subject newSubject = subjectMapper.mapSubjectDtoToSubject(subjectDto);
        if (subjectRepository.existsSubjectByTitle(newSubject.getTitle())) {
            throw new SubjectAlreadyExistsException("Subject already exists");
        }
        subjectRepository.save(newSubject);
        return subjectMapper.mapSubjectToSubjectResponseDto(newSubject);
    }
}
