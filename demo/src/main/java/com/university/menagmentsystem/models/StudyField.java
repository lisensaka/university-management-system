package com.university.menagmentsystem.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "study_fields")
public class StudyField {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String fieldName;

    private double totalCredits;

    @OneToMany(mappedBy = "studyField")
    private Set<Student> student;

    @ManyToOne
    private Department department;


    public double getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(double totalCredits) {
        this.totalCredits = totalCredits;
    }



    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Set<Student> getStudent() {
        return student;
    }

    public void setStudent(Set<Student> student) {
        this.student = student;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
