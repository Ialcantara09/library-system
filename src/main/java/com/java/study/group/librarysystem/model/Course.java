package com.java.study.group.librarysystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseID;
    private String name;
    private int limitOfCostumers;
    private LocalDateTime timetable;
    private String ageGroup;
    private Long priceOfClass;
    private int numberOfClasses;
    private int durationOfClasses;

}
