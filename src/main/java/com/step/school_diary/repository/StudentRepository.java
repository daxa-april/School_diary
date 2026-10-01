package com.step.school_diary.repository;

import com.step.school_diary.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Daria Pevets
 **/
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
