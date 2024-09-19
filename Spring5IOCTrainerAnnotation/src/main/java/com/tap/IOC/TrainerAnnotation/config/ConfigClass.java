package com.tap.IOC.TrainerAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tap.IOC.TrainerAnnotation.impl.JavaTrainer;
import com.tap.IOC.TrainerAnnotation.impl.SqlTrianer;
import com.tap.IOC.TrainerAnnotation.impl.WebTrainer;
import com.tap.IOC.TrainerAnnotation.practice.PracticeHours;

@Configuration
@ComponentScan(basePackages= {"com.tap.IOC.TrainerAnnotation.impl","com.tap.IOC.TrainerAnnotation.practice"})
public class ConfigClass {
	
	@Bean
	public PracticeHours getPracticeHours() {
		return new PracticeHours("3hrs");
	}
	
	@Bean
	public SqlTrianer sqlTrianerObj(){
		return new SqlTrianer("somanna","SQL Trainers", getPracticeHours());
		
	}
	@Bean
	public JavaTrainer javaTrianerObj(){
		return new JavaTrainer("kishtej","java Trainers", getPracticeHours());
		
	}
	
	@Bean
	public WebTrainer webTrianerObj(){
		return new WebTrainer("rohit","Web Trainers", getPracticeHours());
		
	}
	

}
