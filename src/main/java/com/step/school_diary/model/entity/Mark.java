package com.step.school_diary.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author Daria Pevets
 **/
@Setter
@Getter
@Entity
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer value;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Subject subject;
    private LocalDateTime date;
}
