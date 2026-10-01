package com.step.school_diary.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
    private Long id;

    @Min(value = 1, message = "Mark can't be less than 1")
    @Max(value = 5, message = "Mark can't be more than 5")
    private Integer value;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Subject subject;

    private LocalDateTime date;
}
