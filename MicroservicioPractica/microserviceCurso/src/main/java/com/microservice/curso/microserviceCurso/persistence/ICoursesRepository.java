package com.microservice.curso.microserviceCurso.persistence;

import com.microservice.curso.microserviceCurso.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoursesRepository extends CrudRepository<Course,Long>  {
}
