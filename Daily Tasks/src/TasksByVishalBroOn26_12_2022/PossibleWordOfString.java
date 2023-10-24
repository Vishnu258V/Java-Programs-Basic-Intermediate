package TasksByVishalBroOn26_12_2022;

// Q. Write a program to identify the possible words for a given string

//		input1: p_t(String containing a '_' , to find the possible words of the given input)
//		input 2: pet:put:pot:pist
//		output: PET:PUT:POT

class PossibleWord {

	public static void checking(String str) {

		if (str.length() == 3) {

			if (str.charAt(0) == 'P' | str.charAt(0) == 'p' && str.charAt(str.length()-1) == 't' | str.charAt(str.length()-1) == 'T') {
				str = str.toUpperCase();
				System.out.println(str+" - Possible");
			} else {
				 System.out.println("Starting, last Characters are different ");
			}
		} else {
			System.out.println(str + " - Not Possible");
		}

	}
}

public class PossibleWordOfString {
	public static void main(String[] args) {

		PossibleWord.checking("pet");
		PossibleWord.checking("POT");
		PossibleWord.checking("Put");
		PossibleWord.checking("pist");
		PossibleWord.checking("PorT");
		PossibleWord.checking("PT");
		PossibleWord.checking("peN");
		
		
	}
}
