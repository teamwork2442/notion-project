package com.quiz.quiz.service;

import com.quiz.quiz.Model.Quiz;
import com.quiz.quiz.dao.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService{
    @Autowired
    private QuizRepo quizRepo;

    public Quiz creatQuiz(Quiz quiz){
        quizRepo.save(quiz);
        return quiz;
    }
    public Quiz creatQuizMOdelAnswer(Quiz modelanswer){
        quizRepo.save(modelanswer);
        return modelanswer;
    }
    public Quiz creatQuizTime(Quiz time){
        quizRepo.save(time);
        return time;
    }
    public Quiz creatAnswerBYStudent(Quiz answerstudent){
        quizRepo.save(answerstudent);
        return answerstudent;
    }
    public Quiz UpdateQuiz(Quiz quiz){
        quizRepo.save(quiz);
        return quiz;
    }
    public void deleteAll(){
        quizRepo.deleteAll();
    }

    public List<Quiz> getAll(){
        return quizRepo.findAll();
    }

    public Quiz getByID(Long id){
        Optional<Quiz> quiz=quizRepo.findById(id);
        return quiz.orElse(null);

    }



}
