package com.nt.tax;

public class GovTax {

	Double totalPriceTax=0.0;
	
	public Double tax(String name){
		

		if(name=="tata"){
			
			totalPriceTax=20.0;
		}
		
		return totalPriceTax;
	}
}
