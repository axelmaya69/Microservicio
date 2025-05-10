package com.microservice.curso.microserviceCurso.service;

import com.microservice.curso.microserviceCurso.entities.Course;
import com.microservice.curso.microserviceCurso.persistence.ICoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements  ICoursesServices {

    @Autowired
    private ICoursesRepository coursesRepository;


    @Override
    public List<Course> findAll() {
        return (List<Course>) coursesRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return coursesRepository.findById(id).orElseThrow();

    }

    @Override
    public void save(Course course) {
    coursesRepository.save(course);
    }
}
