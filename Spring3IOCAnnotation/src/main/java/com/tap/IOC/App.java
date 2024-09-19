package com.tap.IOC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.tap.IOC.impl.BASICCustomer;
import com.tap.IOC.impl.GoldCustomer;
import com.tap.IOC.impl.PlatinumCustomer;

public class App {
  private static ClassPathXmlApplicationContext ac;

public static void main(String[] args) {
    ac=new ClassPathXmlApplicationContext("beans.xml");
   GoldCustomer gc= (GoldCustomer) ac.getBean("goldCustomer");
   PlatinumCustomer pc=(PlatinumCustomer) ac.getBean("platinumCustomer");
   BASICCustomer bc=(BASICCustomer) ac.getBean("BASICCustomer");
  // BasicCustomer bc=(BasicCustomer) ac.getBean("basic");
   
//   BangloreAddress ba= (BangloreAddress) ac.getBean("bangloreAddress");
//   HyderabadAddress ha= (HyderabadAddress) ac.getBean("hyderabadAddress");
   gc.customerDetails();
   pc.customerDetails();
   bc.customerDetails();
   
   
    
  }
}
