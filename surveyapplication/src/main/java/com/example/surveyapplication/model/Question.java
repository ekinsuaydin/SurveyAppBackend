package com.example.surveyapplication.model;

import com.example.surveyapplication.model.Survey;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String question;

    @OneToMany(orphanRemoval = true)
    @JsonManagedReference
    private List<Answer> answers;

    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int qid) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    //public Survey getSurvey() {
    //    return survey;
    //}

    //public void setSurvey(Survey survey) {
    //    this.survey = survey;
    //}



}
