package com.assignment;

public class StudentResultProcessing extends Student{


		

	public void result(boolean x) {
		
			
			if(x==true)
			{
				System.out.println("Name of the student is "+getName());
				System.out.println("Class of the student "+getCls());
				System.out.println("Phone number of the student "+getPhoneNumber());
				System.out.println("Roll number of the student "+getRoll());
				System.out.println("PASSED");
			}
			else {
				System.out.println("Name of the student is "+getName());
				System.out.println("Class of the student "+getCls());
				System.out.println("Phone number of the student "+getPhoneNumber());
				System.out.println("Roll number of the student "+getRoll());
				System.out.println("Failed");
			}
		}
		
		
}
