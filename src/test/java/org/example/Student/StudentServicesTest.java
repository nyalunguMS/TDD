package org.example.Student;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class StudentServicesTest{

    @Test
    public void getStudentsTest(){

        StudentServices service = new StudentServices();
        List<Student> students = service.getStudents();
//        Student student = new Student(12,"Mancoba");
//        service.addStudent(student);

        assertTrue(students.isEmpty());


    }


}