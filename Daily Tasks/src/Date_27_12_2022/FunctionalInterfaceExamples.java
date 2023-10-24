package Date_27_12_2022;

@FunctionalInterface
interface Square {
	public void AreaOfSquare(int x);
}

// Functional Interface must has only one abstract method.
@FunctionalInterface
interface Rectangle1 {
	void Perimeter(int x, int y) ;
	void Perter(int x, int y) ;
}

@FunctionalInterface
interface Rectangle {
	void Perimeter(int x, int y) ;
	//void Perter(int x, int y) ;
	
}
public class FunctionalInterfaceExamples {
	public static void main(String[] args) {

		// if a single statement going to be printed
		// we can give directly to the Lambda Expression
		Square value = (x) -> System.out.println("Area of Square - "+(x*x));
		value.AreaOfSquare(12);
		
			
		// if multiple statements are going to be printed
		// we can use the body directly to the Lambda Expression
		Rectangle periValue = (x,y) -> {
			System.out.println("\nRectangle width - "+ x);
			System.out.println("Rectangle breath - "+ y);
			
			int perimeter = 2*(x+y);
			System.out.println("Perimeter of the Rectangle is - "+perimeter);
		};
		periValue.Perimeter(11, 13);
		
			
	}
}
