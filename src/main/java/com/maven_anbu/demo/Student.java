package com.maven_anbu.demo;

public class Student {
   
    private int id;
    private String name;
    private String course;

    // Constructor
    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    // toString method
    @Override
    public String toString() {
        return "Student ID: " + id + 
               ", Name: " + name + 
               ", Course: " + course;
    }
}
