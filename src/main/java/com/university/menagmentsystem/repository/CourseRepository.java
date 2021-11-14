package com.university.menagmentsystem.repository;

import com.university.menagmentsystem.models.Course;
import com.university.menagmentsystem.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

    public List<Course> findByCourseName(String courseName);
    Course getById(int id);
    void  deleteById(Long id);
}
