package com.tap.IOC.TrainerAnnotation.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PracticeHours {
	private String practicTime;

	public PracticeHours(String practicTime) {
		
		this.practicTime = practicTime;
	}

	public String getPracticTime() {
		return practicTime;
	}

//    @Autowired
//	public void setPracticTime(@Value("2hrs")String practicTime) {
//		this.practicTime = practicTime;
//	}
	 
		
	public PracticeHours() {
		super();
		
	}
	  
}
