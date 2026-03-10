package com.maven_anbu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;
    private

    @GetMapping("/student")
    public Student getStudent() {
        return helloService.getStudentDetails();
    }
}
