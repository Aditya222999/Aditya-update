package com.allAssignment_progerms;

public class Senior_Citizen {
	
	public static void main(String[] args) {
		
		int age =68;
		
		if (age<18) {
			System.out.println("Minor");
		}else if (age >=18 && age <=60) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior Citizen");
		}
	}

}
