package TasksByVishalBroOn26_12_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//Q.Write a java program to count unique digits in a given number
//  Sample Input: 122334
//  Sample Output: 4(1,2,3 and 4)

public class UniqueDigitsInGivenNumber {

	public static void main(String[] args) {

		System.out.print("Enter the number  - ");
		Scanner sc = new Scanner(System.in);
		Integer number = sc.nextInt();
		int digits;

		// to add the elements from number, but it will be in reverse order
		ArrayList<Integer> newNumber = new ArrayList<>();
		while (number > 0) {
			digits = number % 10;
			number = number / 10;

			// Adding the digits wise to the ArrayList to make sure retrieve index wise
			newNumber.add(digits);
		}
		// to get the original order of the Number
		Collections.reverse(newNumber);

		TreeSet<Integer> list = new TreeSet<>(newNumber);
		int count = 0;
		for (Integer i : list) {
			System.out.print(i + "");
			count++;
		}
		System.out.println("- (" + count + ") elements");

	}

}
