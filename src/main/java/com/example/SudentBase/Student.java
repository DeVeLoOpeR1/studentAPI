package com.example.SudentBase;

public class Student {
    private String name;
    private int studentId;
    private int age;
    private String address;
    private String course;

    public Student(String name, int studentId, int age, String address, String course) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.address = address;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
