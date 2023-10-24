package TasksOn29_12_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class SumOfTheStableNumbers {
	public static void main(String[] args) {

//	Write a java program to find the sum of Stable numbers in given numbers.
//	A number is stable if each digit occur the same number of times. i.e, the frequency of each digit 
//	in the number is the same. For e.g. 2277,4004,11,23,583835,1010 are examples for stable numbers.	
//		Sample Input :
//		Array size:5
//		Array Elements: 1234, 3456, 7888, 89999, 3455
//		Sample Output:4690

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the ARRAY : ");
		int size = sc.nextInt();
		int totalSum_StableNumbers = 0;

		ArrayList<Integer> elements = new ArrayList<>();

		System.out.println("\nEnter the elements one by one to add into Arraylist :");
		// to add the elements into the ArrayList
		while (size > 0) {
			int element = sc.nextInt();
			elements.add(element);
			size--;
		}
		// System.out.println(elements.get(1));

		for (Integer number : elements) {
			int tempNumber = number;

			ArrayList<Integer> numberWithIndexes = new ArrayList<>();
			while (number > 0) {
				int singleDigit = number % 10;
				numberWithIndexes.add(singleDigit);
				number = number / 10;
			}
			Collections.sort(numberWithIndexes);

			// HasSet for adding all the frequency of each digit in number,
			// hence it will give only one value if all digits having same frequency
			// then ---> we can Consider this number as a STABLE Number
			HashSet<Integer> frequencyofNumber = new HashSet<>();

			// to check the no of time a digit repeated
			for (int i = 0; i < numberWithIndexes.size(); i++) {
				int nofTimes = 0;

				for (int j = 0; j < numberWithIndexes.size(); j++) {

					if (numberWithIndexes.get(i) == numberWithIndexes.get(j)) {

						nofTimes++;
					}
				}

				frequencyofNumber.add(nofTimes);
			}

			// System.out.println( "frequency of the "+ tempNumber+" is -
			// "+frequencyofNumber);
			// System.out.println(tempNumber+" - "+frequencyofNumber.size());

			if (frequencyofNumber.size() == 1) {

				totalSum_StableNumbers = tempNumber + totalSum_StableNumbers;
			}

		}

		System.out.println("Sum of the Stable Numbers  - " + totalSum_StableNumbers);

	}
}
