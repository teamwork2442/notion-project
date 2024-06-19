package com.quiz.quiz.controller;

import com.quiz.quiz.Model.Teacher;
import com.quiz.quiz.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @PostMapping("/create")
    public ResponseEntity<Teacher>createTeacher(@RequestBody Teacher teacher){
        return ResponseEntity.ok(teacherService.creatTeacher(teacher));
    }
    @PutMapping("/update")
    public ResponseEntity<Teacher>updateTeacher(@RequestBody Teacher teacher){
        return ResponseEntity.ok(teacherService.UpdateTeacher(teacher));
    }
    @DeleteMapping("/delete")
    public void delete(){
        teacherService.deleteAll();
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Teacher>>getAll(){
        return ResponseEntity.ok(teacherService.getAll());
    }
}
