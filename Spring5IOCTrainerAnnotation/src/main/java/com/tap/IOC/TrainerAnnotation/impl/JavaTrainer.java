package com.tap.IOC.TrainerAnnotation.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tap.IOC.TrainerAnnotation.interfaces.Trainer;
import com.tap.IOC.TrainerAnnotation.practice.PracticeHours;

@Component
public class JavaTrainer implements Trainer {
	String name;
	  String message;
	  
//	  @Autowired
//	  PracticeHours practiceHours;
	  
	  PracticeHours practiceHours;
	  
	  
		
	public PracticeHours getPracticeHours() {
		return practiceHours;
	}


    
	public void setPracticeHours(PracticeHours practiceHours) {
		this.practiceHours = practiceHours;
	}



//	
//  @Autowired
//	public JavaTrainer(@Value("Kshitej") String name,@Value("java trainer") String message) {
//		
//		this.name = name;
//		this.message = message;
//	}
  
	
	public JavaTrainer( String name, String message,  PracticeHours practiceHours) {
		
		this.name = name;
		this.message = message;
		this.practiceHours=   practiceHours;
	}

	public JavaTrainer() {
	super();
	// TODO Auto-generated constructor stub
}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public void getPractice() {
		System.out.println(name+ " says "+message +" for "+practiceHours.getPracticTime());
	}

}
