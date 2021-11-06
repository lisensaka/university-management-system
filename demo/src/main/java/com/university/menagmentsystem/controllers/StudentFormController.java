package com.university.menagmentsystem.controllers;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.university.menagmentsystem.models.Student;
import com.university.menagmentsystem.services.StudentManagementService;
import com.university.menagmentsystem.services.impl.StudentManagmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ums/student")
public class StudentFormController {

    @Autowired
    private StudentManagementService studentManagementService;

    @GetMapping("/all")
    public String getAllStudents(final ModelMap modelMap) {
        List<Student> studentList = studentManagementService.getAllStudents();
        modelMap.addAttribute("students", studentList);
        return "student-list";
    }

    @GetMapping("/new")
    public String newStudent(final ModelMap modelMap) {
        modelMap.addAttribute("studentForm", new Student());
        return "student-detail";
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {

        return studentManagementService.add(student);
    }

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        Student student = studentManagementService.read(id);
        return student;
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentManagementService.add(student);
    }
}