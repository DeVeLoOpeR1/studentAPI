package com.example.SudentBase;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepositary {
    //database connection and crud opertion that we going to apply over the database that can be tha main thing that
    // so all the thing taht are related to the database it is always to there int he repositary class

    HashMap<Integer,Student> stud = new HashMap<Integer,Student>();


    public String addStudent(Student student){
        stud.put(student.getStudentId(),student);
        return " Student success fully Added ";
    }

    public Student getStudent(int studentId){

        return stud.get(studentId);
    }

    public String updateStudent( Student student){
        stud.put(student.getStudentId(), student);
        return "Student details updated successfully ";
    }

    public String deleteStudent( int studentId){
        stud.remove(studentId);
        return "Student deleted successfully";
    }

    public Student getStudent(String name){
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

    public List<Student> getStudent(){
        ArrayList<Student> students = new ArrayList<>();
        for(int i:stud.keySet()){
            students.add(stud.get(i));
        }
        return students;
    }








}
