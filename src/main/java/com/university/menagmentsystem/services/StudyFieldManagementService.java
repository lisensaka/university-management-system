package com.university.menagmentsystem.services;

import com.university.menagmentsystem.DTO.StudyFieldDto;
import com.university.menagmentsystem.models.StudyField;

import java.util.List;

public interface StudyFieldManagementService {
    //  method  Create a sf - C
    public StudyField addField(StudyField studyField);

    // method to read a sf - R
    public StudyFieldDto readField(Long id);

    //  method to update a sf - U
    public StudyField updateField (StudyField studyField);

    // method to delete a sf - D
    public void deleteField (Long id);

    // method to read all sf
    public List<StudyField> getAllFields();


}
