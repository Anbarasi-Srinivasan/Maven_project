package com.maven_anbu.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public Student getStudentDetails() {
        return new Student(101, "Anbu", "Computer Science");
    }
}