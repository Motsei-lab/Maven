package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List <Student> students = new ArrayList<>();

    public List<Student> getStudents(){
        return this.students;
    }

    public void addStudent(Student eachStudent){
        this.students.add(eachStudent);
    }
}
