package com.tap.IOC.add_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tap.IOC.interfaces.Address;

@Component
public class HyderabadAddress implements Address {
//   String area="BTM";
//   String pin="524301";
	@Override
	public String getAddress() {
	  
	return area +"," +pin;
	   
	}
	 String area;
	   String pin;
	   @Autowired
	public HyderabadAddress(@Value("BTM")String area,@Value("524303") String pin) {
		super();
		this.area = area;
		this.pin = pin;
	}
	public HyderabadAddress() {
		super();
		
	}

}
