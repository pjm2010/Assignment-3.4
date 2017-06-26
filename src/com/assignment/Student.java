package com.assignment;

public class Student {
	/*In this class the attributes of the student class are declared under private access specifier*/
		private int roll;
		public int getRoll() {
			return roll;
		}
	
		public void setRoll(int roll) {
			this.roll = roll;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getCls() {
			return cls;
		}
		public void setCls(String cls) {
			this.cls = cls;
		}
		private String name;
		private long phoneNumber;
		private String cls;
	
		public boolean result(int x,int y,int z,int roll){
			int pass=33;
			int totalMark=x+y+z;
			
			if(totalMark>33){
				return true;
			}
			else if(totalMark==33)
			{
				return true;
			}
			else {
				return false;
			}
		}
		
}
