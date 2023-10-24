package com.Inheritance.Examples;
//--------------------------------------
interface class1 {

	static void lenovo() {
		System.out.println("Default method from class1\n");
	}
	public void HP();
}


//---------------------------------------
interface class2 {

	default void lenovo() {
		System.out.println("Default method from class2\n");
	}
	abstract void dell();
}


 //---------------------------------------
class multiple implements class1, class2 {


	@Override
	public void lenovo() {
		class1.lenovo(); // Static method from class1
		class2.super.lenovo(); // Default method from class2
	}

	@Override
	public void dell() {	
	}

	@Override
	public void HP() {
	}
}

//----------------------------------------

public class MultipleInheritance_1 {
	public static void main(String[] args) {
		
		multiple multiple = new multiple() ;
		multiple.lenovo();
		multiple.dell();
		multiple.HP();
		
	}
}
