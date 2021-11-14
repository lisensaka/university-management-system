package com.university.menagmentsystem.DTO;

import com.university.menagmentsystem.models.Course;
import com.university.menagmentsystem.models.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {
    // private int id;
    private String courseName;
    private String courseDescription;
   /* private LocalDate dateOfBirth;
    private int studyYear;*/

    public static CourseDto fromCourseDto(Course course){
        CourseDto courseDto = new CourseDto();
        courseDto.courseName = courseDto.getCourseName();
        courseDto.courseDescription = courseDto.getCourseDescription();

        return courseDto;
    }
}
