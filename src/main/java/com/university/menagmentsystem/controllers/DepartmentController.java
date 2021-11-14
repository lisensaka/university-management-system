package com.university.menagmentsystem.controllers;

import com.university.menagmentsystem.DTO.DepartmentDto;
import com.university.menagmentsystem.models.Department;
import com.university.menagmentsystem.services.DepartmentMAnagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ums/dep")
public class DepartmentController {
    @Autowired
    private DepartmentMAnagementService departmentMAnagementService;

    @GetMapping("/all")
    public List<Department> getAllDepartments() {
        List<Department> departmentList = departmentMAnagementService.getAllDepartments();
        return departmentList;
    }

    @PostMapping("/new")
    public Department saveDepartment(@RequestBody Department department) {

        return departmentMAnagementService.add(department);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable(value = "id") Long id) {
        DepartmentDto departmentDto = departmentMAnagementService.read2(id);
        return ResponseEntity.ok(departmentDto);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<String> deleteDepartment(@PathVariable("id") Long id) {

        try {
            departmentMAnagementService.delete(id);

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(String.format("Department with id %d not found", id));
        }
        return ResponseEntity.ok("Department successfully deleted") ;
    }

    @PutMapping("/update")
    public Department updateDepartment(@RequestBody Department department) {
        return departmentMAnagementService.add(department);
    }

}
