package com.university.menagmentsystem.services.impl;

import com.university.menagmentsystem.DTO.StudyFieldDto;
import com.university.menagmentsystem.models.StudyField;
import com.university.menagmentsystem.repository.StudyFieldRepository;
import com.university.menagmentsystem.services.StudyFieldManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyFieldManagementServiceImpl implements StudyFieldManagementService {
    @Autowired
    private StudyFieldRepository studyFieldRepository;

    @Override
    public StudyField addField(StudyField studyField) {
        return studyFieldRepository.save(studyField);
    }

    @Override
    public StudyFieldDto readField(Long id) {
        StudyField studyField = studyFieldRepository.getById(id);
        StudyFieldDto studyFieldDto = StudyFieldDto.fromStudyFieldDto(studyField);
        return studyFieldDto;
    }

    @Override
    public StudyField updateField(StudyField studyField) {
        return studyFieldRepository.save(studyField);
    }

    @Override
    public void deleteField(Long id) {
        studyFieldRepository.deleteById(id);

    }

    @Override
    public List<StudyField> getAllFields() {
        return this.studyFieldRepository.findAll();
    }


}
