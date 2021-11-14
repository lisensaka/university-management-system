package com.university.menagmentsystem.services.impl;

import com.university.menagmentsystem.DTO.StudentDto;
import com.university.menagmentsystem.models.Student;
import com.university.menagmentsystem.repository.CourseRepository;
import com.university.menagmentsystem.repository.StudentRepository;
import com.university.menagmentsystem.services.StudentManagementService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentManagmentServiceImpl  implements StudentManagementService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    // krijojme nje metode per add student   -C
    @Override
    public Student add(Student student) {    //-C
        return studentRepository.save(student);
    }

    @Override
    public StudentDto read2(Long id) {    //-R
        Student student = studentRepository.getById(id);
        StudentDto studentDto = StudentDto.fromStudentDto(student);
        return studentDto;
    }


    //update method
    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {    //-D
        studentRepository.deleteById(id);
    }



    // kthen listen me te gjithe studentet
    @Override
    public List<Student> getAllStudents() {
        //return this.myMockDb;
        return this.studentRepository.findAll();
    }



    // kthen listen me student ne baze te emrit te studentit
    @Override
    public List<Student> findByName(String firstName) {
        return studentRepository.findByfirstName(firstName);
    }



    // sherben per te vendosur grade te studentit ne baze te id course dhe id student
    @Override
    public boolean gradeStudent(int studentId, int courseId, int grade) {
        return false;
    }


}


