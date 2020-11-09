package com.nt.service;

import com.nt.tax.GovTax;

public class FourWheeler {

	Double price=0.0;
	public Double getPrice(String name){
		
		System.out.println("  get price method ");
		
		if(name=="tata"){
			
			GovTax tax=new GovTax();
			price=40.0;
			System.out.println("  call tax method ");
			
			price=price + tax.tax(name);
			
		}
		
		else if(name=="toyota"){
			
			price=50.0;
		}
		
		else{
			System.out.println("no match found");
		}
		return price;
		
	}
	
}
