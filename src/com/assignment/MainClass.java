package com.assignment;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int roll;
		String cls;
		long phone;
		int phy;
		int chem;
		int math;
		boolean result;
		
	
		StudentResultProcessing sp=new StudentResultProcessing(); //Declaring the object of the child class which will also be able to call the method of the parent class
		
		Scanner scan=new Scanner(System.in); //Taking input from the User
		System.out.println("Enter  your name");
		name=scan.nextLine();
		sp.setName(name);
		
	
		System.out.println("Enter  your class");
		cls=scan.nextLine();
		sp.setCls(cls);
		
		
		System.out.println("Enter  your rol");
		roll=scan.nextInt();
		sp.setRoll(roll);
		
		System.out.println("Enter  your phone number");
		phone=scan.nextLong();
		sp.setPhoneNumber(phone);
		
		System.out.println("Enter physics marks");
		phy=scan.nextInt();
		
		System.out.println("Enter chem marks");
		chem=scan.nextInt();
		
		System.out.println("Enter math mark");
		math=scan.nextInt();
		
		result=sp.result(chem,phy,math,roll);
		sp.result(result);
		scan.close();
		
		
		
	
	}

}
