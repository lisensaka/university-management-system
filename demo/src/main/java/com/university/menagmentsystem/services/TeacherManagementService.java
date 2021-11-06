package com.university.menagmentsystem.services;

import com.university.menagmentsystem.models.Student;
import com.university.menagmentsystem.models.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TeacherManagementService {

    //  method  Create a teacher - C
    public boolean add(Teacher teacher);

    // method to read a teacher - R
    public Teacher read(Long id);

    //  method to update a teacher - U
    public boolean update (Teacher teacher);

    // method to delete a teacher - D
    public boolean delete (Long id);



    // method to read all teacher
    public List<Teacher> getAllTeacher();

    // method to read a teacher by name
    public List<Teacher> findByName(String name);



}
