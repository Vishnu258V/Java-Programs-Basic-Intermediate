package Date_27_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class PossibleWords {
	public static void main(String[] args) {

		 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of inputs :");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " possibilities :");

        ArrayList<String> list = new ArrayList<>();
		while (size > 0) {
			
			String str = sc.nextLine();
			str = sc.next();
			
			list.add(str);
			size--;
		}

        	//System.out.println(list);

			for (String a : list) {

				if (a.charAt(0) == 'P' | a.charAt(0) == 'p' && a.charAt((a.length() - 1)) == 'T'
						| a.charAt((a.length() - 1)) == 't') {
					System.out.println(a + " - Possible");
				} else {
					System.out.println(a + " - Not possible");
				}
			}

    }
	
	
}
