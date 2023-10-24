package com.Inheritance.Examples;
import java.util.*;


class Marks{
	
	private int sub1;
	private int sub2, sub3, sub4;
	
	public Marks(int sub1, int sub2, int sub3, int sub4) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	
		public int getSub1() {
			return sub1;
		}
		public int getSub2() {
			return sub2;
		}
		public int getSub3() {
			return sub3;
		}
		public int getSub4() {
			return sub4;
		}
		public void setSub1(int sub1) {
			this.sub1 = sub1;
		}
		public void setSub2(int sub2) {
			this.sub2 = sub2;
		}
		public void setSub3(int sub3) {
			this.sub3 = sub3;
		}
		public void setSub4(int sub4) {
			this.sub4 = sub4;
		}
 }

	class Student {
		
		private String name ;
		private int rollNum ;
		private String  emailId;
		private Marks mrks;
		
	public Student(String name, int rollNum, String emailId, Marks mrks) {
		this.name = name;
		this.rollNum = rollNum;
		this.emailId = emailId;
		this.mrks = mrks;
	}
	
		public String getName() {
			return name;
		}
		public int getRollNum() {
			return rollNum;
		}
		public String getemailId() {
			return emailId;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setRollNum(int rollNum) {
			this.rollNum = rollNum;
		}
		public void setemailId(String emailId) {
			this.emailId = emailId;
		}

		
		// HAS-A setter and getter
		public Marks getMrks() {
			return mrks;
		}
		public void setMrks(Marks mrks) {
			this.mrks = mrks;
		}
 }


class MarksCalculations {
	
	Marks m1 = new Marks(78,71,81,63);
	Student s1 = new Student("Ganesh",257,"ganesh@bitsVizag.com",m1);
	
	Marks m2 = new Marks(50,75,75,50);
	
	
	public void studentDetails() {
		System.out.println("Student Name = "+s1.getName()+"\nRoll Num = "+s1.getRollNum()+"\nEmail Id = "+s1.getemailId());	
	}
	
	
	public void calculations() {	
		
		int total = m1.getSub1()+m1.getSub2()+m1.getSub3()+m1.getSub4();
		
			if(total >= 250) {
				System.out.println("Total Marks = "+total + " => PASS ");
			}else {
				System.out.println("Total Marks = "+total+" => FAIL");
			}		
	}	


}

public class HAS_ARelation {
	public static void main(String[] args) {
		
		MarksCalculations mrks1 = new MarksCalculations();
		mrks1.studentDetails();
		mrks1.calculations();
		
		
	}
}
