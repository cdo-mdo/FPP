package assignment_2_5;

import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a string: ");
		String inputs = sc.next();
		sc.close();
		System.out.println();
		System.out.print("Reverse string is: ");
		for (int i = inputs.length() - 1; i >= 0; i--) {
			System.out.print(inputs.charAt(i));
		}
	}
}
