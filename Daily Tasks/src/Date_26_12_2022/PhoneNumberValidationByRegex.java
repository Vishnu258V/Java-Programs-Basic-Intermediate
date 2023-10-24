package Date_26_12_2022;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberValidationByRegex {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Wanted to check whether its valid phone number or not
		System.out.print("Enter the Indian moblie number  +91-");
		String  phNumber  = sc.nextLine();
		
		System.out.print("Enter the US mobline number     +1- ");
		String  USphNumber  = sc.nextLine();
		
		boolean ind = Pattern.matches("[6789]{1}[0-9]{9}",phNumber );

		
		if(ind) {
			
			System.out.println("\nValid indian mobile number");
		}else {
			
			System.err.println("\nInvalid indian mobile number! ");
		}

		
		// US phones all use one single format: (NXX) NXX-XXXX, where N is 2–9 and X is 0–9. 
		boolean US = Pattern.matches(".?([2-9]{1}[0-9]{2}).?([2-9]{1}[0-9]{2}).?([0-9]{4})", USphNumber);
		
		if(US) {
			
			System.out.println("\nValid US mobile number");
		}else {
			
			System.err.println("\nInvalid US mobile number! ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
