package com.step.school_diary.repository;

import com.step.school_diary.model.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Daria Pevets
 **/
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
