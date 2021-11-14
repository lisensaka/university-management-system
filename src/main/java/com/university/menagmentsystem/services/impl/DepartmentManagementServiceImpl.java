package com.university.menagmentsystem.services.impl;

import com.university.menagmentsystem.DTO.DepartmentDto;
import com.university.menagmentsystem.models.Department;
import com.university.menagmentsystem.repository.DepartmentRepository;
import com.university.menagmentsystem.services.DepartmentMAnagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentManagementServiceImpl implements DepartmentMAnagementService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department add(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public DepartmentDto read2(Long id) {
        Department department = departmentRepository.getById(id);
        DepartmentDto departmentDto = DepartmentDto.fromDepartmentDto(department);
        return departmentDto;
    }

    @Override
    public Department update(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void delete(Long id) {
        departmentRepository.deleteById(id);

    }

    @Override
    public List<Department> getAllDepartments() {
        return this.departmentRepository.findAll();
    }

    @Override
    public List<Department> findByName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }
}
