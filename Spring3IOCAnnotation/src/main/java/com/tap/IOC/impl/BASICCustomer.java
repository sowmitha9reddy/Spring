package com.tap.IOC.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tap.IOC.add_impl.HyderabadAddress;
import com.tap.IOC.interfaces.Address;
import com.tap.IOC.interfaces.Customer;

//@Component("basic")
@Component
public class BASICCustomer implements Customer {
//	String name="akhil";
//	  String type="basic Customer";
		@Override
		public void customerDetails() {
			System.out.println(name +" is " +type +","+ad.getAddress());
			
		}
		
		String name;
		  String type;
		 // Address ad=new HyderabadAddress();
		  Address ad;
		 
		  
		  
		  
		  
		  
		public Address getAd() {
			return ad;
		}

        @Autowired
		public void setAd(@Qualifier("hyderabadAddress")Address ad) {
			this.ad = ad;
		}

        public BASICCustomer() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Autowired
		public BASICCustomer(@Value("mouryareddy")String name,@Value("Basic customerer") String type) {
			super();
			this.name = name;
			this.type = type;
		}


		public String getName() {
			return name;
		}
		
		
		public String getType() {
			return type;
		}
		//@Autowired
		public void setName(@Value("mourya")String name) {
			this.name = name;
		}
		//@Autowired
		public void setType(@Value("baic customer")String type) {
			this.type = type;
		}
}
