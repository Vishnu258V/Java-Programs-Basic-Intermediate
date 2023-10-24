package Date_26_12_2022;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidationByRegex {

	public static void main(String[] args) {
		 
		System.out.println("Enter the email address");
		Scanner sc = new Scanner(System.in);
		
		String emailId = sc.nextLine();
		
		
		boolean b = Pattern.matches("^([a-zA-Z]{1})([a-zA-Z0-9.*]+)@([a-zA-Z])+.*([a-zA-Z]+)", emailId);
		
		if (b) {
			System.out.println("Valid email");
		}else {
			System.err.println("Invalid");
		}
		
		
		
	}
}
