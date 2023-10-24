package com.if_else;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

//Write a Java program that reads in two floating-point numbers 
//and tests whether they are the same up to three decimal places.

public class If_else_3 {
	public static void main(String[] args) {
		
		System.out.println("ENTER  ( n ) NUMBER OF DECIMALS TO CHECK THOSE ARE ARE SAME ");
		Scanner sc = new Scanner(System.in);
		int decimalCheck = sc.nextInt();
		
		
		System.out.println("\nEnter the 1st Floating-point number ");
		double first =  sc.nextDouble();
		
		System.out.println("Enter the 2nd Floating-point number ");
		double second =  sc.nextDouble();
		
		

		first = (first*Math.pow(10, decimalCheck));
		int a = (int) first;
		
		second = (second*Math.pow(10, decimalCheck));
		int b= (int) second;
		
		

			
	if(a == b) {
		System.out.println("The both valus are same ");
	}else {
		System.out.println("The both are not same they are different ");
	}
	
	
	}

}
