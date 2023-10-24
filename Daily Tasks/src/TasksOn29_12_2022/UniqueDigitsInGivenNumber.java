package TasksOn29_12_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class UniqueDigitsInGivenNumber {

	public static void main(String[] args) {

		System.out.print("Enter the number to Find Unique values - ");
		Scanner sc = new Scanner(System.in);
		Integer number = sc.nextInt();
		int digits;

		ArrayList<Integer> newNumber = new ArrayList<>();
		while (number > 0) {
			digits = number % 10;
			number = number / 10;
			newNumber.add(digits);
		}
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