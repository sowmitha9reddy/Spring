package com.tap.IOC.add_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tap.IOC.interfaces.Address;


@Component
public class BangloreAddress implements Address{
//	String area="Bachupally";
//	   String pin="524301";
		@Override
		public String getAddress() {
			return area +"," +pin;
		   
		}
		String area;
		   String pin;
		   
		public BangloreAddress() {
			super();
		}
		
		@Autowired
		public BangloreAddress(@Value("Bachupally")String area, @Value("524302")String pin) {
			super();
			this.area = area;
			this.pin = pin;
		}

}
