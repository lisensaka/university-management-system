package com.university.menagmentsystem.controllers;

import com.university.menagmentsystem.DTO.StudentDto;
import com.university.menagmentsystem.models.Student;
import com.university.menagmentsystem.services.StudentManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ums/student")
public class StudentController {

    @Autowired
    private StudentManagementService studentManagementService;

  @GetMapping("/all")
    public List<Student> getAllStudents() {
        List<Student> studentList = studentManagementService.getAllStudents();
        return studentList;
    }

    @PostMapping("/new")
    public Student saveStudent(@RequestBody Student student) {

        return studentManagementService.add(student);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<StudentDto> getStudent(@PathVariable(value = "id") Long id) {
        StudentDto student = studentManagementService.read2(id);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<String> deleteStudent(@PathVariable("id") Long id) {

      try {
          studentManagementService.delete(id);

      } catch (Exception e) {
          return ResponseEntity.badRequest().body(String.format("Student with id %d not found", id));
      }
      return ResponseEntity.ok("Student successfully deleted") ;
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentManagementService.add(student);
    }
}