package Date_27_12_2022;

class UnderAge extends Exception {
	static final long serialVersionUID = 1L;

	public UnderAge(String messge) {
		super(messge);
	}

}

class AgeEligibility {

	public void eligibility(int age) throws UnderAge {

		if (age >= 18) {
			System.out.println("Person Eligible for Voting ");
		} else {
			throw new UnderAge("The person Not Eligible for Voting ");
		}
	}

}
public class ExceptionsWithMethodOverridingOverloading {

	public static void main(String[] args) {

		AgeEligibility a1 = new AgeEligibility();
		
		try {
			a1.eligibility(17);
		} catch (UnderAge e) {
			System.out.println(e.getMessage());
		}

	}

}
