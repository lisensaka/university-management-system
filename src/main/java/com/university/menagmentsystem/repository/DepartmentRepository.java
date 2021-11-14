package com.university.menagmentsystem.repository;

import com.university.menagmentsystem.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    public List<Department> findByDepartmentName(String departmentName);

    void  deleteById(Long id);
    Department getById(Long id);
}
