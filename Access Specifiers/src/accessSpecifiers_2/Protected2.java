package accessSpecifiers_2;
import accessSpecifiers.com.*;


class Details {
	protected_1 p1 = new protected_1(0, 0, 0, null);
	
	Details(int price, int lenght, int width, String name) {
		super();
		
	}

		public void show() {
			
			System.out.println(p1.price);
		
		}
	
}
public class Protected2   {
	
	public static void main(String[] args) {
	
		Details d1 = new Details(1000, 20, 10, "Lenovo");
			d1.show();
		
	}
	
						

}
