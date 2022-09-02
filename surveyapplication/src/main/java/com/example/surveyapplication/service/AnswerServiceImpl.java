package com.example.surveyapplication.service;

import com.example.surveyapplication.model.Answer;
import com.example.surveyapplication.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public Answer saveAnswer(Answer answer) {
        return answerRepository.save(answer);
    }

    @Override
    public List<Answer> getAllAnswers() {
        return answerRepository.findAll();
    }

    @Override
    public Answer getAnswerById(int answerId) {
        return answerRepository.findById(answerId).orElse(null);
    }
}
