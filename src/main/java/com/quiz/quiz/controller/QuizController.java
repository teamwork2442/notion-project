package com.quiz.quiz.controller;

import com.quiz.quiz.Model.Quiz;
import com.quiz.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;
    @PostMapping("/create")
    public ResponseEntity<Quiz> createQuiz(@RequestBody Quiz quiz){
        return ResponseEntity.ok(quizService.creatQuiz(quiz));
    }
    @PutMapping("/update")
    public ResponseEntity<Quiz>updateQuiz(@RequestBody Quiz quiz){
        return ResponseEntity.ok(quizService.UpdateQuiz(quiz));
    }
    @PostMapping("/creatMOdelAnswer")
    public ResponseEntity<Quiz>creatModelAnswer(@RequestBody Quiz modelanswer){
        return ResponseEntity.ok(quizService.creatQuizMOdelAnswer(modelanswer));
    }
    @PostMapping("/creattime")
    public ResponseEntity<Quiz>creattime(@RequestBody Quiz time){
        return ResponseEntity.ok(quizService.creatQuizTime(time));
    }
    @DeleteMapping("/delete")
    public void delete(){
        quizService.deleteAll();
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Quiz>getQuiz(@PathVariable Long id){
        return ResponseEntity.ok(quizService.getByID(id));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Quiz>>getAllQuiz(){
        return ResponseEntity.ok(quizService.getAll());
    }

}
