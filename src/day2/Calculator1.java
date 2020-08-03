package day2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculator1 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Put your favorite number: ");
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1: "));
		
		System.out.print("Input your second favorite number: ");
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2: "));
		
		double c = a + b;
		
		System.out.print("The sum of your two favorite numbers " + a + " and "+ b + " is " + c);
		
		input.close();

	}

}
