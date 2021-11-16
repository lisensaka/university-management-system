package com.university.menagmentsystem.DTO;

import com.university.menagmentsystem.models.StudyField;
import com.university.menagmentsystem.models.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {
    private String firstName;
    private String lastName;


    public static TeacherDto fromTeacherDto(Teacher teacher){
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.firstName = teacher.getFirstName();
        teacherDto.lastName = teacher.getLastName();

        return teacherDto;
    }
}
