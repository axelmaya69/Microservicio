package com.microservice.student.microserviceStudent.service;

import com.microservice.student.microserviceStudent.entities.Student;
import com.microservice.student.microserviceStudent.persistence.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;


    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long Id) {
        return studentRepository.findById(Id).orElseThrow();
    }

    @Override
    public void save(Student student) {
    studentRepository.save(student);
    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return studentRepository.findAllByCourseId(idCourse);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student updateStudent = studentRepository.findById(id).get();
        if (studentRepository.existsById(id)){
            updateStudent.setName(student.getName());
            updateStudent.setLastName(student.getLastName());
            updateStudent.setEmail(student.getEmail());
            updateStudent.setCourseId(student.getCourseId());
            return studentRepository.save(updateStudent);
        }
        return null;
    }

    @Override
    public void eliminarStudent(Long id) {

    }
}
