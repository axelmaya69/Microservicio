package com.microservice.student.microserviceStudent.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "Students")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String name;

    @Column(name = "last_Name")
    private String lastName;

    private String email;

    @Column(name = "course_id")
    private  Long courseId;

}

