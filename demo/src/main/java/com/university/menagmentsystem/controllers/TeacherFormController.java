package com.university.menagmentsystem.controllers;

import com.university.menagmentsystem.models.Student;
import com.university.menagmentsystem.models.Teacher;
import com.university.menagmentsystem.services.StudentManagementService;
import com.university.menagmentsystem.services.TeacherManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ums/teacher")
public class TeacherFormController {

    @Autowired
    private TeacherManagementService teacherManagementService;

    @GetMapping("/all")
    public String getAllTeacher(final ModelMap modelMap) {
        List<Teacher> teacherList = teacherManagementService.getAllTeacher();
        modelMap.addAttribute("teachers", teacherList);
        return "teachers-list";
    }

    @GetMapping("/new")
    public String newTeacher(final ModelMap modelMap) {
        modelMap.addAttribute("teacherForm", new Teacher());
        return "teacher-detail";
    }

    @PostMapping("/save")
    public String saveTeacher(@ModelAttribute("teacherForm") Teacher teacher) {
        teacherManagementService.add(teacher);
        return "redirect:all";
    }

    @GetMapping("/get/{id}")
    public String getTeacher(@PathVariable("id") Long id, final ModelMap modelMap) {
        Teacher teacher = teacherManagementService.read(id);
        modelMap.addAttribute("teacherForm", teacher);
        return "teacher-detail";
    }
}
