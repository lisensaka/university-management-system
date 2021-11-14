package com.university.menagmentsystem.repository;

import com.university.menagmentsystem.models.Course;
import com.university.menagmentsystem.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    public List<Student> findByfirstName(String firstName);

    void  deleteById(Long id);
    Student getById(Long id);
}
