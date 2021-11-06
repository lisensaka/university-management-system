package com.university.menagmentsystem.services.impl;


import com.university.menagmentsystem.models.Teacher;
import com.university.menagmentsystem.repository.TeacherRepository;
import com.university.menagmentsystem.services.TeacherManagementService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherManagementServiceImpl implements TeacherManagementService {

    @Autowired
    private TeacherRepository teacherRepository;


    @Override
    public boolean add(Teacher teacher) {    //-C
        try {
            this.teacherRepository.save(teacher);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public Teacher read(Long id) {    //-R
        try {
//            for (Student st : myMockDb) {
//                if(st.getId() == id)
//                    return st;
//            }
//            return null;
            return teacherRepository.getById(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean update(Teacher teacher) {   //-U

        try {
            Teacher tch = read(teacher.getId());
            BeanUtils.copyProperties(tch,teacher);
            return  true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(Long id) {    //-D
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
