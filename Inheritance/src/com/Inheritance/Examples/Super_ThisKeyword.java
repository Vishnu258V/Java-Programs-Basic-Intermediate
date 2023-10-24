package com.Inheritance.Examples;
import java.util.*;

// Just Go through the program in detail
// Just Go through the program in detail
// Just Go through the program in detail
class super1 {
	
			int a ;
			int b ;
			String name ;
			String midName ;
	
		public super1(int a, int b, String name, String midName) {
			this.a = a;
			this.b = b;
			this.name = name;
			this.midName = midName;
		}
	
		void sum () {
			int c = this.a+this.b;
			System.out.println(c);
		}
		
}

class sub1 extends super1 {
		
		String comapany ;
		String location;
		int empId;
		
		// here we will get a compilation error if constructor does't declare properly
		// just go through comments to understand the program
		
		public sub1(int a, int b, String name, String midName, String comapany, String location, int empId) {
			super(10, b, name, "Kumara Swami");
			this.comapany = comapany;
			this.location = location;
			this.empId = empId;
		}
	
		public void show() {	
			super.sum();
			System.out.println("The Method Sum value from the super class \n");
			System.out.println("employee name : "+super.name);
			System.out.println("employee name : "+midName);
			System.out.println("Company name  : "+this.comapany);
			System.out.println("Location of Comapnny : "+location);			
		}	
}

public class Super_ThisKeyword {
	
	public static void main(String[] args) {
		
		   //ArrayList<sub1> list1 = new ArrayList<>();
		
		sub1 s1 = new sub1(10,99,"Anji","Anji", "Havi","Hyderabad",1047);
		sub1 s2 = new sub1(10,99,"Anji","Anji", "Havi","Hyderabad",1047);
		sub1 s3 = new sub1(23,12,"Vishnu","Kumar","Havi","America",1046);
		sub1 s4 = new sub1(45,89,"Rohan","Bagde","Havi","Hyderabad",1049);
		
		s1.show();
		s2.show();
		s3.show();
		s4.show();
		
		
//			for (sub1 s : list1) {
//				System.out.println(s);
//			}
		
	}
}
