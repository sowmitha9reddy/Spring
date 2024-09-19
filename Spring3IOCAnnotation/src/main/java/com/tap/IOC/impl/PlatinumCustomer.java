package com.tap.IOC.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tap.IOC.add_impl.BangloreAddress;
import com.tap.IOC.add_impl.HyderabadAddress;
import com.tap.IOC.interfaces.Address;
import com.tap.IOC.interfaces.Customer;

//@Component("platinumCustomer")
@Component

public class PlatinumCustomer implements Customer{
//  String name="rahul";
//  String type="gold Customer";
	@Override
	public void customerDetails() {
		System.out.println(name +" is " +type +","+ad.getAddress());
		
	}
	
	String name;
	  String type;
	  
	 // Address ad=new HyderabadAddress();
	  Address ad;
	  
	  
	  
	public PlatinumCustomer() {
		super();
		
	}

	@Autowired
	public PlatinumCustomer(@Value("aadhya") String name,@Value("platinum Cutomer") String type) {
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
	public void setName(@Value("aadhya")String name) {
		this.name = name;
	}
	//@Autowired
	public void setType(@Value("platinum Cutomer")String type) {
		this.type = type;
	}

}
