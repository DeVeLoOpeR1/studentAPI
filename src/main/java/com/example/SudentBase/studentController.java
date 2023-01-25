package com.example.SudentBase;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class studentController {
    //crud post get put delete
    HashMap<Integer,Student> stud = new HashMap<Integer,Student>();
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        stud.put(student.getStudentId(),student);
        return " Student success fully Added ";
    }
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("q") int studentId){
        return stud.get(studentId);
    }
    @PutMapping("/update_student")
    public String updateStudent(@RequestBody Student student){
        stud.put(student.getStudentId(), student);
        return "Student details updated successfully ";
    }
    @DeleteMapping("/delete_student/{id}")
    public String deleteStudent(@PathVariable("id") int studentId){
         stud.remove(studentId);
         return "Student deleted successfully";
    }
    @GetMapping("/student_name")
    public Student getStudent(@RequestParam("q") String name){
        Student out = null;
        for(int i : stud.keySet())
        {

            String tem = stud.get(i).getName();
            if(name.equals(tem))
            {
                System.out.println("match found");
                out = stud.get(i);
                break;
            }
        }
        return out;

    }
    @GetMapping("/get_student_list")
    public List<Student> getStudent(){
        ArrayList<Student> students = new ArrayList<>();
        for(int i:stud.keySet()){
            students.add(stud.get(i));
        }
        return students;
    }


}
