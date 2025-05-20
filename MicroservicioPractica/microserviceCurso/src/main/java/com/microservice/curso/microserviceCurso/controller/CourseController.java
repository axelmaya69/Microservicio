package com.microservice.curso.microserviceCurso.controller;

import com.microservice.curso.microserviceCurso.entities.Course;
import com.microservice.curso.microserviceCurso.service.ICoursesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private ICoursesServices coursesServices;


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourse(@RequestBody Course course){
        coursesServices.save(course);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllCourses(){
        return ResponseEntity.ok(coursesServices.findAll());
    }


    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(coursesServices.findById(id));
    }

    @GetMapping("/search-student/{idCourse}")
    public ResponseEntity<?> findStudentsByIdCourse(@PathVariable Long idCourse ){
    return ResponseEntity.ok(coursesServices.findStudentsByIdCourse(idCourse));
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<String> actualzarCourse(@PathVariable Long id, @RequestBody Course course){

    }

}
