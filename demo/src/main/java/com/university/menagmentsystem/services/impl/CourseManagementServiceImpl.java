package com.university.menagmentsystem.services.impl;

import com.university.menagmentsystem.models.Course;
import com.university.menagmentsystem.repository.CourseRepository;
import com.university.menagmentsystem.services.CourseManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseManagementServiceImpl implements CourseManagementService {

    @Autowired
    private CourseRepository courseRepository;


    // krijojme nje metode per te pare listen me te gjitha kurset
    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
