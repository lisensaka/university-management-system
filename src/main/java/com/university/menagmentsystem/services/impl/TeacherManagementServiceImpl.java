package com.university.menagmentsystem.services.impl;


import com.university.menagmentsystem.models.Teacher;
import com.university.menagmentsystem.repository.TeacherRepository;
import com.university.menagmentsystem.services.TeacherManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherManagementServiceImpl implements TeacherManagementService {

    @Autowired
    private TeacherRepository teacherRepository;


    @Override
    public Teacher add(Teacher teacher) {    //-C

           return teacherRepository.save(teacher);
    }

    @Override
    public Teacher read(Long id) {    //-R

            return teacherRepository.getById(id);
    }

    @Override
    public Teacher update(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public boolean delete(Long id) {
        try{
            Teacher teacher = read(id);
            if(teacher != null && teacher.getId() == id) {
                teacherRepository.delete(teacher);
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return null;
    }

    @Override
    public List<Teacher> findByName(String name) {
        return null;
    }


}
