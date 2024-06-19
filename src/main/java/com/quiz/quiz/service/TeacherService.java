package com.quiz.quiz.service;

import com.quiz.quiz.Model.Quiz;
import com.quiz.quiz.Model.Teacher;
import com.quiz.quiz.dao.QuizRepo;
import com.quiz.quiz.dao.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepo teacherRepo;
    //@Autowired
    //private QuizService quizService;

    public Teacher creatTeacher(Teacher teacher){
        teacherRepo.save(teacher);
        return teacher;
    }
    public Teacher UpdateTeacher(Teacher teacher){
        teacherRepo.save(teacher);
        return teacher;
    }
    public void deleteAll(){
        teacherRepo.deleteAll();
    }
    public List<Teacher> getAll(){
        return teacherRepo.findAll();
    }


}
