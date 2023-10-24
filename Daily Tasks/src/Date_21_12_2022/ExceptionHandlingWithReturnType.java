package Date_21_12_2022;

class ReturnTypes {

	public void Devide(int a, int b) {

		try {
			int c = a / b;

		} catch (Exception e) {

			System.out.println("Devide Void Return - Denominator can't be ZERO");
		}

	}

	public int devide(int a, int b) {

		try {

			return a / b;
		} catch (Exception e) {

			System.out.println("devide int return - It will give an Arithmetic Error");
			return 0;
		}

	}

	public boolean StringNullPointer(String s1) {

		String s2 = "vishnu";
		
		
		return s1.equals(s2);
	}

}

public class ExceptionHandlingWithReturnType {
	public static void main(String[] args) {

		ReturnTypes r1 = new ReturnTypes();

		r1.Devide(50, 0);

		r1.devide(50, 0);
		// System.out.println(a);

		boolean s = r1.StringNullPointer(null);
		System.out.println(s);
		/*
		 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
		 * "String.equals(Object)" because "s1" is null
		 */	}
}
