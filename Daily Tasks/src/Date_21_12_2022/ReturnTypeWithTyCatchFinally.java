package Date_21_12_2022;

public class ReturnTypeWithTyCatchFinally {

	int a = 10;
	int b = 5;

	@SuppressWarnings("finally")
	public int FinallyBlock() {

		try {

			return a / b;
		} catch (Exception e) {

			return 0;
		} finally {

			return 150;
		}

	}

	public int catchBlock() {

		try {

			return a / b;
		} catch (Exception e) {

			return 0;
		} finally {

			// nothing is given here
		}

	}

	public int TryBlock() {

		int c = 0;
		try {

			c = a / b;
			return c;
		} catch (Exception e) {

			// nothing is given here

		} finally {

			// nothing is given here
		}

		return c;

	}

	public static void main(String[] args) {

		ReturnTypeWithTyCatchFinally r1 = new ReturnTypeWithTyCatchFinally();

		int f = r1.FinallyBlock();
		int c = r1.catchBlock();
		int t = r1.TryBlock();

		System.out.println("finally block return value  " + f);
		System.out.println("catch block return value    " + c);
		System.out.println("try block only return value " + t);

	}
}
