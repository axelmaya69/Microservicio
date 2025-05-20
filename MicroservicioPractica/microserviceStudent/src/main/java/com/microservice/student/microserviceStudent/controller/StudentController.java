package com.microservice.student.microserviceStudent.controller;

import com.microservice.student.microserviceStudent.entities.Student;
import com.microservice.student.microserviceStudent.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
    studentService.save(student);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllStudent(){
        return ResponseEntity.ok(studentService.findAll());
    }


    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
    return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("/search-my-course/{idCourse}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long idCourse){
    return ResponseEntity.ok(studentService.findByIdCourse(idCourse));
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<String> eliminarStudent(@PathVariable Long id, @RequestBody Student student){
    try{
        Student actualizarStudent = studentService.updateStudent(id, student);
        return ResponseEntity.status(HttpStatus.CREATED).body("Editado con exito");
    }catch (Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error," +
                "inténtelo más tarde.");
    }
    }


    @DeleteMapping("delete/{id}")
    public ResponseEntity<String > eliminarStudent(@PathVariable Long id){

    }

}
