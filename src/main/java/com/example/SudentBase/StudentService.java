package com.example.SudentBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    // making object of the repositary class using autowired
    @Autowired
    StudentRepositary studentRepositary;


    public String addStudent(Student student){
        return studentRepositary.addStudent(student);
    }

    public Student getStudent(int studentId){

        return studentRepositary.getStudent(studentId);
    }

    public String updateStudent( Student student){
        return studentRepositary.updateStudent(student);
    }

    public String deleteStudent( int studentId){
        return studentRepositary.deleteStudent(studentId);
    }

    public Student getStudent(String name){

        return studentRepositary.getStudent(name);

    }

    public List<Student> getStudent(){

        return studentRepositary.getStudent();
    }








}
