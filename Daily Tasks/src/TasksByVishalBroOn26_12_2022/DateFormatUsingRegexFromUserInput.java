package TasksByVishalBroOn26_12_2022;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DateFormatUsingRegexFromUserInput {

	public static void main(String[] args) {
		
		
		// To check the date format given by the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Randome date with month, year -");
		String RandomeDates = sc.nextLine();
		System.out.print("Enter the date, month in between 2000 - 3000 years");
		String specificDates = sc.nextLine();
		
		boolean b = Pattern.matches("[\\d]{2}.[\\d]{2}.[\\d]{4}", RandomeDates);
		
		if (b) {
			System.out.println( "Randome Dates - Valid! ");
		} else {
			System.out.println("Randome Dates - Invalid!");
		}

		
		boolean c = Pattern.matches("(0?[1-9]|1[0-9]|2[0-9]|3[01]).(0?[1-9]|1[012]).(2[0-9]{3})", specificDates);
			//System.out.println(b);

//		boolean d = Pattern.matches("(3[01]|[12][0-9]|0[1-9]).(1[0-2]|0[1-9]).[0-9]{4}", specificDates);
//		System.out.println(c);
		
		if (c) {
			System.out.println( "Specific Dates - Valid! ");
		} else {
			System.out.println("Specific Dates - Invalid!");
		}

		
		
		
		
		
	}

}
