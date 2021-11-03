package com.university.menagmentsystem.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int studyYear;


    @OneToOne
    private User user;

    @OneToMany(mappedBy = "student")
    private Set<StudyField> studyField;

    @OneToMany(mappedBy = "student")
    private Set<StudentAnswer> studentAnswers;

    @OneToMany(mappedBy = "student")
    private Set<StudentCourse> studentCourse;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<StudyField> getStudyField() {
        return studyField;
    }

    public void setStudyField(Set<StudyField> studyField) {
        this.studyField = studyField;
    }

    public Set<StudentAnswer> getStudentAnswers() {
        return studentAnswers;
    }

    public void setStudentAnswers(Set<StudentAnswer> studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    public Set<StudentCourse> getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(Set<StudentCourse> studentCourse) {
        this.studentCourse = studentCourse;
    }
}
