package com.example.surveyapplication.controller;

import com.example.surveyapplication.model.Answer;
import com.example.surveyapplication.model.Question;
import com.example.surveyapplication.model.Survey;
import com.example.surveyapplication.service.AnswerService;
import com.example.surveyapplication.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answer")
@CrossOrigin
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    @Autowired
    private QuestionService questionService;

    @PostMapping("/add/question/{questionId}")
    public String add(@RequestBody Answer answer, @PathVariable int questionId){
        Question question = questionService.getQuestionById(questionId);
        answer.setQuestion(question);
        question.getAnswers().add(answer);
        answerService.saveAnswer(answer);
        return "Answer saved";
    }

    @GetMapping("/getAll")
    public List<Answer> getAllAnswer(){
        return answerService.getAllAnswers();
    }

    @GetMapping("/{id}")
    public Answer getAnswerById(@PathVariable int answerId)
    {
        return answerService.getAnswerById(answerId);
    }

    @PutMapping("/{answerId}/question/{questionId}")
    public Answer createSurvey(
            @PathVariable int questionId,
            @PathVariable int answerId
    ) {
        Answer answer = answerService.getAnswerById(answerId);
        Question question = questionService.getQuestionById(questionId);
        //answer.setQuestion(question);
        //question.getAnswers().add(answer);
        return answerService.saveAnswer(answer);
    }
}
