package com.microservice.curso.microserviceCurso.service;

import com.microservice.curso.microserviceCurso.client.IStudentClient;
import com.microservice.curso.microserviceCurso.controller.dto.StudentDTO;
import com.microservice.curso.microserviceCurso.entities.Course;
import com.microservice.curso.microserviceCurso.http.response.StudentByCourseResponse;
import com.microservice.curso.microserviceCurso.persistence.ICoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements  ICoursesServices {

    @Autowired
    private ICoursesRepository coursesRepository;

    @Autowired
    private IStudentClient studentClient;

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

    @Override
    public StudentByCourseResponse findStudentsByIdCourse(Long idCourse) {
    //Consuta el curso
        Course course = coursesRepository.findById(idCourse).orElse(new Course());

        //obtener los estudiantes
        List<StudentDTO>  studentDTOList = studentClient.findAllStudentsByCourse(idCourse);
        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();
    }
}
