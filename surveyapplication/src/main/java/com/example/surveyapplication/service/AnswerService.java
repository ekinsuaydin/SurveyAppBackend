package com.example.surveyapplication.service;

import com.example.surveyapplication.model.Answer;

import java.util.List;
import java.util.Optional;

public interface AnswerService {
    public Answer saveAnswer(Answer answer);
    public List<Answer> getAllAnswers();

    Answer getAnswerById(int answerId);
}
