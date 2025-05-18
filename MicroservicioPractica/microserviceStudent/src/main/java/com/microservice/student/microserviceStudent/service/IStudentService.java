package com.microservice.student.microserviceStudent.service;

import com.microservice.student.microserviceStudent.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long Id);

    void save (Student student);

    List <Student> findByIdCourse(Long idCourse);

    //actualzar

    //eliminar

}
