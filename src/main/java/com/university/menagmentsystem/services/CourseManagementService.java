package com.university.menagmentsystem.services;

import com.university.menagmentsystem.DTO.CourseDto;
import com.university.menagmentsystem.models.Course;
import com.university.menagmentsystem.models.Student;

import java.util.List;


public interface CourseManagementService {
    // method to read all students
    public List<Course> getAllCourses();
    //  method  Create a student - C
    public Course add(Course course);

    // method to read a student - R

    public CourseDto read (int id);


    //  method to update a student - U
    public Course update (Course course);

    // method to delete a student - D
    public void delete (Long id);

    // method to read a student by name
    public List<Course> findByName(String couseName);


}
