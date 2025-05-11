package com.microservice.curso.microserviceCurso.service;

import com.microservice.curso.microserviceCurso.entities.Course;
import com.microservice.curso.microserviceCurso.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICoursesServices {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);
}
