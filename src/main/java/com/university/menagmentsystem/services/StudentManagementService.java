package com.university.menagmentsystem.services;

import com.university.menagmentsystem.DTO.StudentDto;
import com.university.menagmentsystem.models.Student;
import org.springframework.stereotype.Service;

import java.util.List;

// crud for student
public interface StudentManagementService {
    //  method  Create a student - C
    public Student add(Student student);

    // method to read a student - R
    public StudentDto read2(Long id);

    //  method to update a student - U
    public Student update (Student student);

    // method to delete a student - D
    public void delete (Long id);

    // method to read all students
    public List<Student> getAllStudents();

    // method to read a student by name
    public List<Student> findByName(String name);



    // method to grade a student for a specific course
    public boolean gradeStudent(int studentId, int courseId, int grade);

}
