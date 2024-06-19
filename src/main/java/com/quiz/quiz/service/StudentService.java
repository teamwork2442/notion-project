package com.quiz.quiz.service;

import com.quiz.quiz.Model.Quiz;
import com.quiz.quiz.Model.Student;
import com.quiz.quiz.dao.QuizRepo;
import com.quiz.quiz.dao.StudentREpo;
import com.sun.org.apache.bcel.internal.generic.I2F;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentREpo studentREpo;
    @Autowired
    private QuizService quizService;
    @Autowired
    private QuizRepo quizRepo;

    public Student creatStudebt(Student student){
        studentREpo.save(student);
        return student;
    }
    public Student UpdateStudebt(Student student){
        studentREpo.save(student);
        return student;
    }
    public void deleteAll(){
        studentREpo.deleteAll();
    }

    public List<Student> getAll(){
        return studentREpo.findAll();
    }

    public Quiz DoQuiz(Long quizId){
        Quiz quiz=quizRepo.getById(quizId);
        return quiz;
    }
    public Double answerQuiz(String quiz,Long quizId){
        Quiz quiz1=quizRepo.getById(quizId);
        if(quiz1.getModelanswer().equals(quiz))
            return 10.0;
        else
            return 0.0;
    }

}
