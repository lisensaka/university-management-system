package com.university.menagmentsystem.controllers;

import com.university.menagmentsystem.DTO.CourseDto;
import com.university.menagmentsystem.models.Course;
import com.university.menagmentsystem.repository.CourseRepository;
import com.university.menagmentsystem.services.CourseManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ums/course")
public class CourseController {
    @Autowired
    private CourseManagementService courseManagementService;
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/all")
    public List<Course> getAllCourses() {
        List<Course> courseList = courseManagementService.getAllCourses();
        return courseList;
    }

    @PostMapping("/new")
    public Course saveCourse(@RequestBody Course course) {

        return courseManagementService.add(course);
    }


    @GetMapping("/get/{id}")
    public ResponseEntity<CourseDto> getCourse(@PathVariable(value = "id") int id) {
        CourseDto courseDto = courseManagementService.read(id);
        return ResponseEntity.ok(courseDto);
    }

    @DeleteMapping({"/delete/{id}"})
    public String deleteCourse(@PathVariable("id") Long id) {
        courseManagementService.delete(id);
        return "u fshi coursi me kte id: " + id;
    }

//    @DeleteMapping("/deletecourse/{id}")
//    public Map<String, Boolean> deleteCourse(@PathVariable(value = "id") int id)
//            throws ResourceNotFoundException {
//        Course course = courseRepository.getById(id);
//        courseRepository.delete(course);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//    }
    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course) {

        return courseManagementService.add(course);
    }

}
