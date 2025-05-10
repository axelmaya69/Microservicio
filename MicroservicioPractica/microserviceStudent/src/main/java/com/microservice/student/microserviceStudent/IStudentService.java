package com.microservice.student.microserviceStudent;

import com.microservice.student.microserviceStudent.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();
    
}
