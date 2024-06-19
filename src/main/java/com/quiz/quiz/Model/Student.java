package com.quiz.quiz.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student extends BaseEntity {

    private  String grade;
    private String subject;
    @ManyToMany
    @JoinTable(name = "STUDENT_QUIZ",joinColumns =
    @JoinColumn(name = "STUDENT_ID"),inverseJoinColumns = @JoinColumn(name = "QUIZ_ID"))
    private List<Quiz> quiz;

}
