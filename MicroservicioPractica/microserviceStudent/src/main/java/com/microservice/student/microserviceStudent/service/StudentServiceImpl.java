package com.microservice.student.microserviceStudent.service;

import com.microservice.student.microserviceStudent.entities.Student;
import com.microservice.student.microserviceStudent.persistence.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;


    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public Student findById(Long Id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return List.of();
    }
}
