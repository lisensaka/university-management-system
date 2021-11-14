package com.university.menagmentsystem.DTO;

import com.university.menagmentsystem.models.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    // private int id;
    private String firstName;
    private String lastName;
   /* private LocalDate dateOfBirth;
    private int studyYear;*/

    public static StudentDto fromStudentDto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.firstName = student.getFirstName();
        studentDto.lastName = student.getLastName();

        return studentDto;
    }
}
