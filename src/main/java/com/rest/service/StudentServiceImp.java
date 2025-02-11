package com.rest.service;

import com.rest.model.Student;
import com.rest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    private StudentRepository repo;

    @Override
    public Student addStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public List<Student> getAll() {
        return repo.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return repo.findById(id).get();
    }
}
