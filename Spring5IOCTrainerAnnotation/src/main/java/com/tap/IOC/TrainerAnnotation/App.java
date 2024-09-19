package com.tap.IOC.TrainerAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tap.IOC.TrainerAnnotation.config.ConfigClass;
import com.tap.IOC.TrainerAnnotation.impl.JavaTrainer;
import com.tap.IOC.TrainerAnnotation.impl.SqlTrianer;
import com.tap.IOC.TrainerAnnotation.impl.WebTrainer;


public class App {
  //private static ClassPathXmlApplicationContext ac;
private static AnnotationConfigApplicationContext ay;

public static void main(String[] args) {
	  // ac=new ClassPathXmlApplicationContext("beans.xml");
//	 JavaTrainer jt= (JavaTrainer) ac.getBean("javaTrainer");
//	   SqlTrianer st=(SqlTrianer) ac.getBean("sqlTrianer");
//	   WebTrainer wt= (WebTrainer) ac.getBean("webTrainer");
	
	  
	  
	  
//	   jt.getPractice();
//	   st.getPractice();
//	   wt.getPractice();
	   
	   
	   ay=new AnnotationConfigApplicationContext(ConfigClass.class);
	   JavaTrainer jt= (JavaTrainer) ay.getBean("javaTrianerObj"); //JavaTrainer.class
	 //  SqlTrianer st=(SqlTrianer) ay.getBean("sqlTrianer");
	   SqlTrianer st=(SqlTrianer) ay.getBean("sqlTrianerObj");
	   WebTrainer wt= (WebTrainer) ay.getBean("webTrianerObj");
	   
	   jt.getPractice();
	   st.getPractice();
	   wt.getPractice();
		
	 
  }
}
