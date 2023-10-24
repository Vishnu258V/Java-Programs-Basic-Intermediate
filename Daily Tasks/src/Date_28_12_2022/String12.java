package Date_28_12_2022;

import java.util.Scanner;

public class String12 {
	public static void main(java.lang.String[] args) {

		System.out.println("enter your string :");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String[] sp = str.split(" ");

		System.out.println("second word is :" + sp[1]);

		int l = str.length();
		String upper = "";
		System.out.println(l);

		for (int i = 0; i < l; i++) {
			if (l == 0) {
				System.out.println("LESS");
			} else {
				upper = sp[1].toUpperCase();
			}
		}
		System.out.println(upper);
	}

}
