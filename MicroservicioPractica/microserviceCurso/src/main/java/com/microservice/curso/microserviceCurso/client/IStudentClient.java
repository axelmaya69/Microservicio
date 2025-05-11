package com.microservice.curso.microserviceCurso.client;

import com.microservice.curso.microserviceCurso.controller.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microserviceStudent",url = "localhost:8090/api/student")
public interface IStudentClient {

    @GetMapping("/search-my-course/{idCourse}")
    List<StudentDTO> findAllStudentsByCourse(@PathVariable Long idCourse);


}
