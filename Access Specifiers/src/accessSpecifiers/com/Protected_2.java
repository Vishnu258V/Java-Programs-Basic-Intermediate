package accessSpecifiers.com;
import accessSpecifiers.com.*;


public class Protected_2 extends protected_1 {
	
	


	public Protected_2(int price, int lenght, int width, String name) {
		super(price, lenght, width, name);
		
	}

	@Override
	public String toString() {
		return "The keyboard name is "+getName()+" with length of "+getLenght()+" inch "
				+ "and width is "+getWidth()+" inches , which is currently "+getPrice()+
		
				" Rupees in the Market ";
	}

	public static void main(String[] args) {
	

		Protected_2 p2 = new Protected_2(900, 20, 10, "Lenovo");
		System.out.println(p2);

	}

}
