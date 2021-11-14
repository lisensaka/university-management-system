package com.university.menagmentsystem.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departmentName;

    @OneToMany(mappedBy = "department")
    private Set<Teacher> teachers;

    @OneToMany(mappedBy = "department")
    private Set<StudyField> studyFields;

    @ManyToMany
    @JoinTable(name = "department_course",joinColumns = @JoinColumn(name = "department_id")
    ,inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courses;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Set<StudyField> getStudyFields() {
        return studyFields;
    }

    public void setStudyFields(Set<StudyField> studyFields) {
        this.studyFields = studyFields;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
