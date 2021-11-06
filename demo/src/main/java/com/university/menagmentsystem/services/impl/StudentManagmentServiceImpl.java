package com.university.menagmentsystem.services.impl;

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
    public Student read(int id) {    //-R
        try {
//            for (Student st : myMockDb) {
//                if(st.getId() == id)
//                    return st;
//            }
//            return null;
            return studentRepository.getById(id);
        } catch (Exception e) {
            return null;
        }
    }

    //update method
    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public boolean delete(int id) {    //-D
        try{
            Student student = read(id);
            if(student != null && student.getId() == id) {
                studentRepository.delete(student);
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
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


