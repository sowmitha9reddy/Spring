package com.tap.IOC.TrainerAnnotation.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tap.IOC.TrainerAnnotation.interfaces.Trainer;
import com.tap.IOC.TrainerAnnotation.practice.PracticeHours;

@Component
public class SqlTrianer implements Trainer{
	private String name;
	 private String message;
	  private PracticeHours practiceHours;
	  
	 
//	  @Autowired
//		public void setPracticeHours(@Qualifier("practiceHours")PracticeHours practiceHours) {
//			this.practiceHours = practiceHours;
//		}
//	  
	  
	public SqlTrianer() { 
		super();
		// TODO Auto-generated constructor stub
	}

	
	public SqlTrianer(String name,String message,PracticeHours practiceHours) {
		super();
		this.name = name;
		this.message = message;
		this.practiceHours=practiceHours;
	}


	@Override
	public void getPractice() {
		System.out.println(name+ " says "+message +" for "+practiceHours.getPracticTime());
		
	}

}
