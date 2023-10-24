package TasksOn29_12_2022;

import java.util.Scanner;

public class RetriveTheSecondWordInString {

//	Q. Write a java program to retrieve the second word in a given string in uppercase.
//	   If there is no second word in a given string it should display "LESS"  as output.

//			Sample Input: India hyderabad telangana
//			Sample Output:HYDERABAD
//			Sample input: India
//			Sample output:LESS(as no second word appear in a given string it should display less)

	public static void main(java.lang.String[] args) {

		System.out.println("Enter the String  :");
		Scanner sc = new Scanner(System.in);

		String stringInput = sc.nextLine();
		// String []arrayWord = new String[]{stringInput};

		String arrWord[] = stringInput.split(" ");

		// System.out.println(arrWord.length);
		if (arrWord.length > 1) {

			String str = arrWord[1];
			str = str.toUpperCase();
			System.out.println(str);

		} else {
			System.out.println("LESS");
		}

	}
}