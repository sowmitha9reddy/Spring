package com.tap.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.IOC.impl.JavaTrainer;
import com.tap.IOC.impl.SqlTrainer;
import com.tap.IOC.impl.WebTrainer;
import com.tap.IOC.practice.PracticeHours;

public class App {
  private static ClassPathXmlApplicationContext cx;

public static void main(String[] args) {
	 cx= new ClassPathXmlApplicationContext("beans.xml");
	 
	//PracticeHours ph=new PracticeHours();
	PracticeHours ph=(PracticeHours) cx.getBean("ph");


      
       JavaTrainer jt= (JavaTrainer) cx.getBean("jt");
        SqlTrainer st=(SqlTrainer) cx.getBean("st");
       WebTrainer wt= (WebTrainer) cx.getBean("wt");
//       jt.setPh(ph);
//       
//       st.setPh(ph);
//       wt.setPh(ph);
       
       
       
//       jt.setName("kshitij");
//       jt.setMessage("java trainer");
//       
//       st.setName("somanna");
//       st.setMessage("SQL Trainer");
//       
//       wt.setName("rohit");
//       wt.setMessage("web trainer");
       
       
       jt.getPractice();
       st.getPractice();
       wt.getPractice();
        
       
       
  }
}
