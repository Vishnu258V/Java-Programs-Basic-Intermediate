package TasksByVishalBroOn26_12_2022;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Q.Write a program to find the sum of powers of digits.
//	Sample:
//	input=123
//	output:10((1^2)+(2^3)+(3^0) => (1+8+1=10)

public class SumOfThePowerOfTheDigits {
    public static void main(String[] args) {
        System.out.print("Enter the number to find the sum of powers of digits: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int sum = sumOfPowersOfDigits(number);
        
        System.out.println("The sum of powers of digits: " + sum);
    }
    
    public static int sumOfPowersOfDigits(int number) {
        int sum = 0;
        int previousDigit = 0;
        
        while (number > 0) {
            int currentDigit = number % 10;
            System.out.println(currentDigit+" - "+previousDigit);
            sum += Math.pow(currentDigit, previousDigit);
            previousDigit = currentDigit;
            number /= 10;
        }
        return sum;
    }
}


// // int a[] = {123445};
// System.out.print("Enter the number to Find the sum of Powers of Digits - ");
// Scanner sc = new Scanner(System.in); Integer number = sc.nextInt();
// int digits;
 
// // to add the elements from number, but it will be in reverse order
// ArrayList<Integer> newNumber = new ArrayList<>(); 
// while (number > 0) { 
//	 digits = number % 10; 
//	 number = number / 10;
 
// // Adding the digits wise to the ArrayList to make sure retrieve index wise
// newNumber.add(digits); 
// }
 
// // to get the original order of the Number Collections.reverse(newNumber);
 
// double power; double sum = 0;
 
// for (int i = 0; i < newNumber.size(); i++) {
 
// if (i != newNumber.size() - 1) { power = Math.pow(newNumber.get(i),
// newNumber.get(i + 1)); } else { power = Math.pow(newNumber.get(i), 0); }
 
// sum = sum + power; }
 
// int finalOutput = (int) sum;
// System.out.println("\nThe sum of powers of digits - " + finalOutput);
 



