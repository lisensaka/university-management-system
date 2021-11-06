package com.university.menagmentsystem.repository;

import com.university.menagmentsystem.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    public List<Student> findByfirstName(String firstName);
}
