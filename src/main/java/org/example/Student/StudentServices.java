package org.example.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServices {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents(){
        return this.students;
    }

    public void addStudent(Student students){
        this.students.add(students);
    }
}
