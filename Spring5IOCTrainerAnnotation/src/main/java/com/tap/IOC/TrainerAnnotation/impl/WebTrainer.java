package com.tap.IOC.TrainerAnnotation.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tap.IOC.TrainerAnnotation.interfaces.Trainer;
import com.tap.IOC.TrainerAnnotation.practice.PracticeHours;

@Component
public class WebTrainer implements Trainer {
	String name;
	  String message;
	  PracticeHours practiceHours;
	  
//		 
//	  @Autowired
//		public void setPracticeHours(@Qualifier("practiceHours")PracticeHours practiceHours) {
//			this.practiceHours = practiceHours;
//		}
	  
	 
		
	public WebTrainer() {
		super();
		// TODO Auto-generated constructor stub
	}


//   @Autowired
//	public WebTrainer(@Value("Rohit")String name,@Value("WEb Trainer") String message) {
//		super();
//		this.name = name;
//		this.message = message;
//	}
	
   
	public WebTrainer(String name, String message, PracticeHours practiceHours) {
		super();
		this.name = name;
		this.message = message;
		this.practiceHours= practiceHours;
	}



	@Override
	public void getPractice() {
		System.out.println(name+ " says "+message +" for "+practiceHours.getPracticTime());
		
	}

}
