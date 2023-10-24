package Date_22_12_2022;

class arithmeticException extends Exception {
	private static final long serialVersionUID = 1L;

	public arithmeticException(String message) {
		super(message);
	}

	public arithmeticException(Throwable cause) {
		super(cause);
	}
}

class deivision {
	public static void devide(int a, int b) throws arithmeticException {

		if (b == 0) {
			throw new arithmeticException("Denominator must not be zero ");

		} else {
			int c = a / b;
			System.out.println(c);
		}
	}
}

public class CustomExceptionWithMultipleMesseges {
	public static void main(String[] args) throws arithmeticException {

		try {

			deivision.devide(10, 0);
		} catch (arithmeticException e) {

			throw new arithmeticException(e.getMessage());
		}

	}
}
