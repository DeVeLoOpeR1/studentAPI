package com.example.SudentBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class studentController {
    //crud post get put delete

    @Autowired
    StudentService studentService;
    @PostMapping("/add_student")
    public ResponseEntity addStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.IM_USED);
    }
    @GetMapping("/get_student")
    public ResponseEntity getStudent(@RequestParam("q") int studentId){

        return new ResponseEntity<>(studentService.getStudent(studentId),HttpStatus.ACCEPTED);
    }
    @PutMapping("/update_student")
    public ResponseEntity updateStudent(@RequestBody Student student){
        return new ResponseEntity(studentService.updateStudent(student),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete_student/{id}")
    public ResponseEntity deleteStudent(@PathVariable("id") int studentId){

         return new ResponseEntity(studentService.deleteStudent(studentId),HttpStatus.OK);
    }
    @GetMapping("/student_name")
    public ResponseEntity getStudent(@RequestParam("q") String name){

        return new ResponseEntity(studentService.getStudent(name),HttpStatus.ACCEPTED);

    }
    @GetMapping("/get_student_list")
    public ResponseEntity getStudent(){
        return new ResponseEntity<>(studentService.getStudent(),HttpStatus.OK);
    }


}
