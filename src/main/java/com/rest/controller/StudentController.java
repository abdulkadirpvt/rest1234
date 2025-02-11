package com.rest.controller;

import com.rest.model.Student;
import com.rest.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentServiceImp service;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return this.service.addStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return this.service.getAll();
    }

    @GetMapping("{id}")
    public Student getsingle(@PathVariable() int id){
        return this.service.getStudentById(id);
    }

}
