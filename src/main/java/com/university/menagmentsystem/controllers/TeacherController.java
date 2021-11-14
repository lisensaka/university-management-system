package com.university.menagmentsystem.controllers;

import com.university.menagmentsystem.models.Teacher;
import com.university.menagmentsystem.services.TeacherManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ums/teacher")
public class TeacherController {

    @Autowired
    private TeacherManagementService teacherManagementService;

    @GetMapping("/all")
    public List<Teacher> getAllTeacher() {
        List<Teacher> teacherList = teacherManagementService.getAllTeacher();
        return teacherList;
    }

    @PostMapping("/new")
    public Teacher saveTeacher(@RequestBody Teacher teacher) {

        return teacherManagementService.add(teacher);
    }

    @PutMapping("/update")
    public Teacher updateTeacher(@RequestBody Teacher teacher) {

        return teacherManagementService.add(teacher);
    }

    @GetMapping("/get/{id}")
    public Teacher getTeacher(@PathVariable("id") Long id) {
        Teacher teacher = teacherManagementService.read(id);
        return teacher;
    }
    @DeleteMapping({"/delete/id"})
    public Boolean deleteTeacher(@PathVariable("id") Long id) {

        return teacherManagementService.delete(id);
    }
}

