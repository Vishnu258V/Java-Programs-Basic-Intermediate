package Date_22_12_2022;

class IlligalTypeOfArguments extends Exception {

	static final long serialVersionUID = 1L;

	public IlligalTypeOfArguments(String message) {
		super(message);

	}
}

class UsernameNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public UsernameNotFoundException(String message) {
		super(message);

	}
}

class methodsChecking {

	public static void illigaltype(String str) throws IlligalTypeOfArguments {

		String s1 = "Hai";

		if (s1.equals(str)) {
			System.out.println("Both Strings are Equal ");
		} else {
			System.out.println("Both Strings are Not-Equal ");
		}
	}

	public static void userName(String str) throws UsernameNotFoundException {

		if (str != null) {
			System.out.println("User Nmae is = " + str);
		} else {

			throw new UsernameNotFoundException("User must be a value, it can't assigned as null");
		}

	}

}

public class MultipleCustomClassesInSingleFile {

	public static void main(String[] args) throws UsernameNotFoundException {

		try {

			throw new IlligalTypeOfArguments("Illigal type of code");

		} catch (IlligalTypeOfArguments e) {

			System.out.println(e.getMessage());
		}

		try {

			methodsChecking.userName(null);
			
		} catch (UsernameNotFoundException e) {

			System.out.println(e.getMessage());
		}

		
		// rest of the program
		System.out.println("hii");
		System.out.println("hello");
		System.out.println("hii");

	}

}
