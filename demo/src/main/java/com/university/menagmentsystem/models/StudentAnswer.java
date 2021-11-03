package com.university.menagmentsystem.models;

import javax.persistence.*;

@Entity
@Table(name = "student_answer")
public class StudentAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private ExamQuestion examQuestion;



    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ExamQuestion getExamQuestion() {
        return examQuestion;
    }

    public void setExamQuestion(ExamQuestion examQuestion) {
        this.examQuestion = examQuestion;
    }
}
