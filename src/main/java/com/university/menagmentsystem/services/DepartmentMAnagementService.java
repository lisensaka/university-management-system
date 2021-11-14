package com.university.menagmentsystem.services;

import com.university.menagmentsystem.DTO.CourseDto;
import com.university.menagmentsystem.DTO.DepartmentDto;
import com.university.menagmentsystem.models.Course;
import com.university.menagmentsystem.models.Department;

import java.util.List;

public interface DepartmentMAnagementService {
    // method to read all department
    public List<Department> getAllDepartments();

    //  method  Create a department - C
    public Department add(Department department);

    // method to read a department - R

    public DepartmentDto read (int id);


    //  method to update a department - U
    public Department update (Department department);

    // method to delete a department - D
    public boolean delete (int id);

    // method to read a department by name
    public List<Department> findByName(String couseName);
}
