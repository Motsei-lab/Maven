package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StudentServiceTest extends TestCase {


    @Test
    public void testGetStudent(){
        StudentService studentService = new StudentService();
        Student studentOne = new Student(66,"Motsei");

        studentService.addStudent(studentOne);
        List<Student> listsOfStudents = studentService.getStudents();

        boolean actualLists = listsOfStudents.isEmpty();
        assertFalse(actualLists);
    }

    @Test
    public void testAddStudent() {
        StudentService studentServ = new StudentService();
        Student studentTwo = new Student(75,"Lethabo");
        studentServ.addStudent(studentTwo);
        List<Student> studentList = studentServ.getStudents();

        assertEquals(75, studentList.getLast().id);
   }
}