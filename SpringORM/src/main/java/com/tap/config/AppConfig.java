package com.tap.config;


import java.util.Properties;

import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.tap.ORM.entity","com.tap.ORM.Implementation"}) // Adjust based on your package structure


public class AppConfig {
	

	

	 @Bean
	    public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	       // sessionFactory.setConfigLocation(new org.springframework.core.io.ClassPathResource("hibernate.cfg.xml")); // Config file location
	        sessionFactory.setPackagesToScan("com.tap.ORM.entity"); // Package where your entities are stored

	        Properties hibernateProperties = new Properties();
	        hibernateProperties.setProperty(AvailableSettings.DRIVER, "com.mysql.cj.jdbc.Driver");
	        hibernateProperties.setProperty(AvailableSettings.URL, "jdbc:mysql://localhost:3306/hibernate");
	        hibernateProperties.setProperty(AvailableSettings.USER, "root");
	        hibernateProperties.setProperty(AvailableSettings.PASS, "root");
	        hibernateProperties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQLDialect");
	        hibernateProperties.setProperty(AvailableSettings.SHOW_SQL, "true");
	        hibernateProperties.setProperty(AvailableSettings.FORMAT_SQL, "true");
	        hibernateProperties.setProperty(AvailableSettings.USE_SQL_COMMENTS, "true");
	        hibernateProperties.setProperty(AvailableSettings.HBM2DDL_AUTO, "update");

	        sessionFactory.setHibernateProperties(hibernateProperties);

	        return sessionFactory;
	    }

	  
	

}
