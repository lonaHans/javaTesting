package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceTest extends TestCase {

    @Test
    public void testStudent(){
        StudentService student = new StudentService();

        Student student1 = new Student(011,"Lona");
        List<Student> students = student.getAllStudents();
        student.addStudent(student1);


        boolean result = students.isEmpty();

        assertTrue(result);


    }

}