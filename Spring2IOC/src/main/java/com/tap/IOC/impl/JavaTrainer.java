package com.tap.IOC.impl;

import com.tap.IOC.interfaces.Trainer;
import com.tap.IOC.practice.PracticeHours;

public class JavaTrainer implements Trainer {
//   String name="kshitij";
//   String message="java trainer";
	String name;
  String message;
  
  PracticeHours practiceHours;
	
   
	

	

//public void setName(String name) {
//	this.name = name;
//}
//public void setMessage(String message) {
//	this.message = message;
//}

public PracticeHours getPracticeHours() {
	return practiceHours;
}

public void setPracticeHours(PracticeHours practiceHours) {
	this.practiceHours =practiceHours;
}

public JavaTrainer(String name, String message) {
	
	this.name = name;
	this.message = message;
}

public JavaTrainer() {
	super();
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public String getMessage() {
	return message;
}

	@Override
	public void getPractice() {
		System.out.println(name+ " says "+message +" for "+practiceHours.getPracticTime());
		
	}

}
