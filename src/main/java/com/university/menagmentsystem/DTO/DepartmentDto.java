package com.university.menagmentsystem.DTO;

import com.university.menagmentsystem.models.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DepartmentDto {
    // private int id;
    private String departmentName;

   /* private LocalDate dateOfBirth;
    private int studyYear;*/

    public static DepartmentDto fromDepartmentDto(Department department){
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.departmentName = department.getDepartmentName();

        return departmentDto;
    }
}
