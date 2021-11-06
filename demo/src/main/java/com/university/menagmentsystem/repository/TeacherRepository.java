package com.university.menagmentsystem.repository;

import com.university.menagmentsystem.models.Student;
import com.university.menagmentsystem.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {

    public List<Teacher> findByfirstName(String firstName);
}
