package com.Inheritance.Examples;



class Bse{
	
	
	public String bird() {
		return "Parrot";
	}
	
}
class derive extends Bse {
	
	@Override
	public String bird() {
		return "not a bird";		
		
	}
	
}


public class Base {

	public static void main(String[] args) {
		
		Bse d1 = new derive();
		System.out.println(d1.bird());;
		
	}
	
}

