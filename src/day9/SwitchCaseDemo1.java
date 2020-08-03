package day9;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		// switch case statement

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = input.nextInt();

		System.out.print("Enter second number: ");
		int b = input.nextInt();

		System.out.print("Enter an operation (^ *): ");
		char c = input.next().charAt(0);

		switch (c) {

		case '^':
			System.out.println("a raised to b: " + (Math.pow(a, b)));
			break;

		case '*':
			System.out.println("a multiplied to b: " + (a * b));
			break;

		}

		input.close();

	}

}
