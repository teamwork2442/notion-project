package com.quiz.quiz.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
@Entity
public class Teacher extends BaseEntity {
    @OneToMany(mappedBy = "teacher")
    private List<Quiz> quizzes;

}
