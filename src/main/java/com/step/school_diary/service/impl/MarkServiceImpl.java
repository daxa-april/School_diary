package com.step.school_diary.service.impl;

import com.step.school_diary.exception.InvalidMarkException;
import com.step.school_diary.exception.ResourceNotFoundException;
import com.step.school_diary.mapper.MarkMapper;
import com.step.school_diary.model.dto.responseDto.MarkResponseDto;
import com.step.school_diary.model.entity.Mark;
import com.step.school_diary.model.entity.Student;
import com.step.school_diary.model.entity.Subject;
import com.step.school_diary.repository.MarkRepository;
import com.step.school_diary.repository.StudentRepository;
import com.step.school_diary.repository.SubjectRepository;
import com.step.school_diary.service.MarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Daria Pevets
 **/
@RequiredArgsConstructor
@Service
public class MarkServiceImpl implements MarkService {

    private final MarkRepository markRepository;
    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;
    private final MarkMapper markMapper;

    @Override
    public MarkResponseDto save(Long studentId, Long subjectId, Integer value) {
        Mark mark = new Mark();
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student with ID " + studentId + " not found"));
        Subject subject = subjectRepository.findById(subjectId.intValue())
                .orElseThrow(() -> new ResourceNotFoundException("Subject with id " + subjectId + " doesn't exist"));
        if (value < 1 || value > 5) {
            throw new InvalidMarkException("Mark can't be less than 1 or more than 5");
        } else {
            mark.setValue(value);
            mark.setStudent(student);
            mark.setSubject(subject);
            markRepository.save(mark);
        }
        return markMapper.mapMarkToMarkResponseDto(mark);
    }
}
