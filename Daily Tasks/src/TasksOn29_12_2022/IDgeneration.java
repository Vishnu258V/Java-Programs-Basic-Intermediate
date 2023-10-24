package TasksOn29_12_2022;

import java.util.Scanner;

public class IDgeneration {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the First Name  :  ");
		String firstName = sc.nextLine();

		System.out.print("Enter the Last NAme   :  ");
		String lastName = sc.nextLine();

		System.out.print("Enter the Pin that contains digits with any length  : ");
		long pinNumber = sc.nextLong();

//		 converting long value into the Array Long value
//		long arr[] = new long[] {pinNumber};

		String convrtPinNumber = String.valueOf(pinNumber);

		System.out.print("Enter the number from (1-9) for the Id generation   : ");
		int number = sc.nextInt();

		StringBuffer sb1 = new StringBuffer();

		if (firstName.length() < lastName.length()) {

			sb1.append(firstName.charAt(firstName.length() - 1));
			sb1.append(lastName);

		} else if (lastName.length() < firstName.length()) {

			sb1.append(lastName.charAt(lastName.length() - 1));
			sb1.append(firstName);

		} else if (firstName.length() == lastName.length()) {

			int comp = lastName.compareTo(firstName);

			if (comp == 1) {

				sb1.append(firstName.charAt(firstName.length() - 1));
				sb1.append(lastName);
			} else if (comp < 1) {

				sb1.append(lastName.charAt(lastName.length() - 1));
				sb1.append(firstName);

			} else {

				sb1.append(firstName.charAt(firstName.length() - 1));
				sb1.append(lastName);
			}

		}

		char pinIndexes[] = convrtPinNumber.toCharArray();

		sb1.append(pinIndexes[number - 1]);
		sb1.append(pinIndexes[pinIndexes.length - number]);

		System.out.println("\n\nGenerated Id - " + sb1);

		StringBuffer sb2 = new StringBuffer();
		for (int i = 0; i < sb1.length(); i++) {

			char c;
			if (Character.isLowerCase(sb1.charAt(i))) {
				c = sb1.charAt(i);
				// System.out.println(c);
				char ch = Character.toUpperCase(c);
				// System.out.println(ch);
				sb2.append(ch);

			} else {

				c = sb1.charAt(i);
				char ch = Character.toLowerCase(c);
				sb2.append(ch);
			}
		}

		System.out.println("\nModified Id - " + sb2);
		
		

	}
}
