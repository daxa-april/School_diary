package com.step.school_diary.validator;

import com.step.school_diary.model.annotation.SubjectValid;
import com.step.school_diary.repository.SubjectRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Daria Pevets
 **/
public class SubjectValidator implements ConstraintValidator<SubjectValid, String> {

    @Autowired
    private SubjectRepository subjectRepository; // Spring автоматически внедрит бин в валидатор

    @Override
    public boolean isValid(String title, ConstraintValidatorContext context) {
        return !title.isBlank() && !subjectRepository.existsSubjectByTitle(title);
    }
}
