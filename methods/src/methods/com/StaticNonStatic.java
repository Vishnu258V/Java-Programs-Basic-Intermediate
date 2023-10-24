package methods.com;


class staticmMethods {
	
	public static void sum() {

		 System.out.println("This is Static method no need to create object \n");
	}
	
	public void show() {
		System.out.println("This is from the NON -Static method need of object creation is mandatory");
	}
	
	
}

public class StaticNonStatic {

	public static void main(String[] args) {

		// Static methods we can directly call with class name
		staticmMethods.sum();

		// Non Static method has to create object to call 
		staticmMethods s1 = new staticmMethods();
		s1.show();
		
	}

}
