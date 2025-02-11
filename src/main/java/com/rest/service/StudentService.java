package com.rest.service;

import com.rest.model.Student;

import java.util.List;

public interface StudentService {
    public Student addStudent(Student student);
    public List<Student> getAll();
    public Student getStudentById(int id);
}
