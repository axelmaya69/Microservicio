package com.microservice.curso.microserviceCurso.service;

import com.microservice.curso.microserviceCurso.entities.Course;

import java.util.List;

public interface ICoursesServices {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);


}
