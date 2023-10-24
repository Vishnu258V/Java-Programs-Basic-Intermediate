package Date_22_12_2022;

@SuppressWarnings("serial")
class Custome extends RuntimeException {

	public Custome(String message) {
		super(message);
	}
}

class votingEligibility {

	public void ageChecking(int age) {
		if (age < 18) {
			throw new Custome("Not eligible for the Voting");
		} else {
			System.out.println(" Eligible! ");
		}
	}

}

public class CustomeExceptionClass {
	public static void main(String[] args) {

		votingEligibility v1 = new votingEligibility();
		String try2 = "";

		try {
			v1.ageChecking(30);
			v1.ageChecking(20);
			v1.ageChecking(17);
			v1.ageChecking(29);

			try {

				v1.ageChecking(17);
				v1.ageChecking(29);

			} catch (Custome e) {

				try2 = e.getMessage();
			}

		} catch (Custome e) {

			System.err.println(e.getMessage());
			// System.out.println(try2);
		}

	}
}
