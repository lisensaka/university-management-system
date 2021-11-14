package com.university.menagmentsystem.services;

import com.university.menagmentsystem.DTO.DepartmentDto;
import com.university.menagmentsystem.models.Department;

import java.util.List;

public interface DepartmentMAnagementService {
    //  method  Create a dep - C
    public Department add(Department department);

    // method to read a dep - R
    public DepartmentDto read2(Long id);

    //  method to update a dep - U
    public Department update (Department department);

    // method to delete a dep - D
    public void delete (Long id);

    // method to read all dep
    public List<Department> getAllDepartments();

    // method to read a dep by name
    public List<Department> findByName(String name);

}
