package com.step.school_diary.repository;

import com.step.school_diary.model.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Daria Pevets
 **/
public interface MarkRepository extends JpaRepository <Mark, Long> {
}
