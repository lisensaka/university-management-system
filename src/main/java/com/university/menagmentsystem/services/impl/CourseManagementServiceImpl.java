package com.university.menagmentsystem.services.impl;

import com.university.menagmentsystem.DTO.CourseDto;
import com.university.menagmentsystem.DTO.StudentDto;
import com.university.menagmentsystem.models.Course;
import com.university.menagmentsystem.models.Student;
import com.university.menagmentsystem.models.Teacher;
import com.university.menagmentsystem.repository.CourseRepository;
import com.university.menagmentsystem.services.CourseManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseManagementServiceImpl implements CourseManagementService {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired


    // krijojme nje metode per te pare listen me te gjitha kurset
    @Override
    public List<Course> getAllCourses() {
        return this.courseRepository.findAll();
    }

    @Override
    public Course add(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public CourseDto read(int id) {    //-R
        Course course = courseRepository.getById(id);
        CourseDto courseDto = CourseDto.fromCourseDto(course);
        return courseDto;
    }

    @Override
    public Course update(Course course) {
        return courseRepository.save(course);
    }

    /*@Override
    public boolean delete(int id) {
        try{
            Course course = readCourse(id);
            if(course != null && course.getId() == id) {
                courseRepository.delete(course);
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }*/
    @Override
    public void delete(Long id) {    //-D
       courseRepository.deleteById(id);
    }

    @Override
    public List<Course> findByName(String couseName) {
        return courseRepository.findByCourseName(couseName);
    }

}
