package com.nt.test;

import com.nt.service.FourWheeler;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("  1 l");
		
		System.out.println(" 2 l ");
		System.out.println("  22l ");	
		FourWheeler fw=new FourWheeler();
		
		Double price=fw.getPrice("tata");
		
		
		System.out.println("  price "+price);
		
	}

}
