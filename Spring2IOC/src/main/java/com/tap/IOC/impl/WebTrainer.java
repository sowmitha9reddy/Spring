package com.tap.IOC.impl;

import com.tap.IOC.interfaces.Trainer;
import com.tap.IOC.practice.PracticeHours;

public class WebTrainer  implements Trainer{

//	 String name="rohit";
//	 String message="web trainer";
	String name;
	  String message;
	  PracticeHours practiceHours;
	  public PracticeHours getPracticeHours() {
			return practiceHours;
		}

		public void setPracticeHours(PracticeHours practiceHours) {
			this.practiceHours = practiceHours;
		}
		
		public String getName() {
		return name;
	}
		public String getMessage() {
			return message;
		}

//	public void setName(String name) {
//		this.name = name;
//	}
//
//	
//
//	public void setMessage(String message) {
//		this.message = message;
//	}

		@Override
		public void getPractice() {
			// System.out.println(name+ " says "+message +" for "+ph.practicTime3);
			System.out.println(name+ " says "+message +" for "+practiceHours.getPracticTime());
			
		}

public WebTrainer(String name, String message) {
	super();
	this.name = name;
	this.message = message;
}
public WebTrainer() {
	super();
	// TODO Auto-generated constructor stub
}

}
