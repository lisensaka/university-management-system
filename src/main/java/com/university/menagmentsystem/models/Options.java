package com.university.menagmentsystem.models;

import javax.persistence.*;

@Entity
public class Options {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean optionValue;
    private int isCorrect;

    @ManyToOne
    private Question question;


    public boolean isOptionValue() {
        return optionValue;
    }

    public void setOptionValue(boolean optionValue) {
        this.optionValue = optionValue;
    }

    public int getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(int isCorrect) {
        this.isCorrect = isCorrect;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
