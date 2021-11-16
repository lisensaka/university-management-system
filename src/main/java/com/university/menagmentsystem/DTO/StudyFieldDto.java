package com.university.menagmentsystem.DTO;

import com.university.menagmentsystem.models.StudyField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudyFieldDto {

    private String fieldName;
    private double totalCredits;


    public static StudyFieldDto fromStudyFieldDto(StudyField studyField){
        StudyFieldDto studyFieldDto = new StudyFieldDto();
        studyFieldDto.fieldName = studyField.getFieldName();
        studyFieldDto.totalCredits = studyField.getTotalCredits();

        return studyFieldDto;
    }
}
