package TasksByVishalBroOn26_12_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Q. Write a java program to display array elements as alternative minimum and maximum values
//		Sample Input:
//			Array size : 5
//			Array Elements : 1 2 3 4 5
//			Sample Output: 5 1 4 2 3 (max min max min format).

public class ArrayAlternativeMinMaxValues {
	public static void main(String[] args) {

		System.out.print("Enter the size of the array [ x ] - ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the " + size + " elemets to add into array  => press enter after each element");

		int i = 0;
		while (size > 0) {
			int element = sc.nextInt();
			arr[i] = element;
			i++;

			size--;
		}

		ArrayList<Integer> sortedArray = new ArrayList<>();
		// to sort the elements
		Arrays.sort(arr);

		for (int a : arr) {
			sortedArray.add(a);
		}
		// System.out.println(sortedArray.get(1));

		ArrayList<Integer> finalList = new ArrayList<>();

		// to get the values from the starting ascending order
		int min = 0;
		int max = 0;
		for (int j = 0; j < sortedArray.size(); j++) {

			if (j % 2 == 0) {
				finalList.add(sortedArray.get(((sortedArray.size() - 1) - max)));
				max++;
			} else {
				finalList.add(sortedArray.get(min));
				min++;
			}

		}
		System.out.println("\nElements as alternative max-min values - " + finalList);

	}
}
