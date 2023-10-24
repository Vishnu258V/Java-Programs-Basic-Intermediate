 package com.Inheritance.Examples;

import java.util.ArrayList;

class company {
	 
	 String name ;
	 String location;
	public company(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}	 
 }
 
 class employee {
	 
	String empName ;
	int empId;
	company cmp;
	public employee(String empName, int empId, company cmp) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.cmp = cmp;	
	}
	
	@Override
	   public String toString() {
		   
		   return "\n\nName of the employee : "+empName+
				  "\nEmployee ID          : "+empId+
				  "\nCompany              : "+cmp.name+
				  "\nLocation of Company  : "+cmp.location;
				  
	   }
 }
 
 public class HAS_ARelation_2 {
	  public static void main(String[] args) {

		company c1 = new company("HaviSolutions", "Hyderabad");
		
		employee e1 = new employee("Vishnu",1046,c1);
		employee e2 = new employee("Anji",1047,c1);
		employee e3 = new employee("Kavya",1048,c1);
		employee e4 = new employee("Prathibha",1049,c1);
		employee e5 = new employee("Rohan",1050,c1);
		
		ArrayList<employee> list = new ArrayList<>();
			list.add(e5);
			list.add(e4);
			list.add(e3);
			list.add(e2);
			list.add(e1);
			

			
			for(employee e : list) {
				System.out.println(e);
			}
		
	  
   }
}
