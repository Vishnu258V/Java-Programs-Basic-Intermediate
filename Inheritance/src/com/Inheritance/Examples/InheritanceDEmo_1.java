package com.Inheritance.Examples;

import java.util.*;

// HAS- A  Relation

class EmployeeDetails {

	String name;
	double salary;
	int employeeeId;
	String Company;

	public EmployeeDetails(String name, double salary, int employeeeId, String company) {
		this.name = name;
		this.salary = salary;
		this.employeeeId = employeeeId;
		this.Company = company;
	}
}

class Organizations {
	String companyLocation;
	EmployeeDetails details;

	Organizations(String companyLocation, EmployeeDetails emp) {
		this.companyLocation = companyLocation;
		this.details = emp;
	}

	@Override
	public String toString() {
		return "\nEmployee name is " + details.name + " and working with the " + details.Company
				+ " which is located in " + companyLocation + " with salary of " + details.salary + " per month";
	}
}

public class InheritanceDEmo_1 {
	public static void main(String[] args) {

		EmployeeDetails emp1 = new EmployeeDetails("Vishnu", 50000, 1110, "Havi");
		Organizations org = new Organizations("hyd", emp1);

		EmployeeDetails emp2 = new EmployeeDetails("anji", 50000, 1500, "TCS");
		Organizations org2 = new Organizations("Bangalore", emp2);

		EmployeeDetails emp3 = new EmployeeDetails("Rohan", 50000, 1200, "Wipro");
		Organizations org3 = new Organizations("Mumbai", emp3);

		System.out.println(org);
		System.out.println(org2);
		System.out.println(org3);

	}
}
