package com.jbk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("testapi")
public class QuestionController {
	
	public Question getQuestion() {
		Question question=new Question();  //this is just a dummy code
		question.setQuestionText("java is platform independent...");
		question.setOption1("Yes");
		question.setOption2("No");
		question.setCorrectOption("1");
		question.setExplanation("due to byte code....which is os independent");
		return question;
		
	}

}
