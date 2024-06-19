package com.quiz.quiz.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Timer;


@Setter
@Getter
@Data
@Entity
@Table
public class Quiz extends BaseEntity  {
    private String Question;
    private String modelanswer;
    private String studentanswer;
    private Date time;

    @ManyToOne
    @JoinColumn(name = "TEACHER_ID")
    private Teacher teacher;
    @ManyToMany(mappedBy = "quiz")
    private List<Student> students;




}
