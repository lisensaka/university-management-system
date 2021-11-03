package com.university.menagmentsystem.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String courseName;
    private String courseDescription;
    private double credits;

    @ManyToMany
    @JoinTable(name = "teachers_courses",joinColumns = @JoinColumn(name = "course_id"),inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private Set<Teacher> teachers;

    @ManyToMany
    @JoinTable(name = "department_course",joinColumns = @JoinColumn(name = "course_id"),inverseJoinColumns = @JoinColumn(name = "department_id"))
    private Set<Department> departments;

    @OneToMany(mappedBy = "course")
    private Set<StudentCourse> courses;

    @OneToMany(mappedBy = "course")
    private Set<Exam> exams;

    @OneToMany(mappedBy = "course")
    private Set<Question> questions;

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    public Set<StudentCourse> getCourses() {
        return courses;
    }

    public void setCourses(Set<StudentCourse> courses) {
        this.courses = courses;
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }
}
