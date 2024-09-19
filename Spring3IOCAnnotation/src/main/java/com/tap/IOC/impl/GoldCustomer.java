package com.tap.IOC.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tap.IOC.add_impl.BangloreAddress;
import com.tap.IOC.interfaces.Address;
import com.tap.IOC.interfaces.Customer;

//@Component("goldCustomer")
@Component
public class GoldCustomer implements Customer {
     
//	String name="rohitgt";
//	  String type="platinumCustomer";
	 
		@Override
		public void customerDetails() {
			System.out.println(name +" is " +type +","+ad.getAddress());
			
		}
		
		 String name;
		  String type;
		  
		 // Address ad=new BangloreAddress();
		  Address ad;
		  
		
		  public GoldCustomer() {
			super();
			// TODO Auto-generated constructor stub
		}



		@Autowired
		public GoldCustomer(@Value("charvi")String name,@Value("Gold Customer") String type) {
			super();
			this.name = name;
			this.type = type;
		}



		public Address getAd() {
			return ad;
		}


         @Autowired
		public void setAd(@Qualifier("bangloreAddress")Address ad) {
			this.ad = ad;
		}



		public String getName() {
			return name;
		}
		
		
		
		public String getType() {
			return type;
		}
		//@Autowired
				public void setName(@Value ("sowmitha")String name) {
					this.name = name;
				}
		
		//@Autowired
		public void setType(@Value("gold customer")String type) {
			this.type = type;
		}
}
