package practiseforgithub;

import java.util.Scanner;

public class Displaypattern1 {


public static void traingularPyramid() {
	for (int i = 1; i <= 5; i++) {
		for (int j = 4; j >= i; j--) {
			System.out.print(" ");
		}
		for (int k = 1; k <= (2 * i - 1); k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

public static void mixMxPyramid() {
	int i, j, k;
	for(i=1;i<=5;i++)
	{
	for(j=i;j<5;j++)
	{
	System.out.print(" ");
	}
	for(k=1;k<=(i*2-1);k++)
	{
	System.out.print("*");
	}
	System.out.println();
	}
	for(i=4;i>=1;i--)
	{
	for(j=5;j>i;j--)
	{
	System.out.print(" ");
	}
	for(k=1;k<=(i*2-1);k++)
	{
	System.out.print("*");
	}
	System.out.println();
	}
}

public static void backSlash() {
	for (int i = 1; i<=5; i++) {
		for (int j=i;j<5;j++) {
			System.out.print(" ");
		}
		for (int k=1;k<=5;k++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}
public void newBackSlash() {
	
	int i,j;
	for(i=1;i<=5;i++) {
		for(j=1;j<=9;j++) {
			if((i+j)==6||(i+j)==7||(i+j)==8||(i+j)==9||(i+j)==10) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}
public static void invertedDimaond() {
	int i, j, k;
	for( i=0;i<=4;i++) {
	for( j=0;j<=i;j++)
	{
	System.out.print(" ");
	}
	for(k=i;k<=4;k++)
	{
	System.out.print("*"+" ");
	}
	System.out.println();
	}
	
	for(i=4;i>=0;i--)
	{
	for(j=0;j<i;j++)
	{
	System.out.print(" ");
	}
	for(k=i-1;k<=4;k++)
	{
	System.out.print("*"+" ");
	}
	System.out.println();
	}
	
}

public static void rightTriangle() {
	int i,j;
	for(i=1;i<=5;i++) {
		for(j=1;j<=5;j++) {
			if(i==5||j==5||(i+j==6)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}

public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your choice-1. for mixMxpyramid, 2. for triangularpyramid, 3.for backSlash and 4. for newBackSlash:");
	int choice=input.nextInt();
	
	switch (choice) {
	case 1:
		mixMxPyramid();
		break;
	case 2:
		traingularPyramid();
		break;
	case 3:
		backSlash();
		break;
	case 4:
		new Displaypattern1().newBackSlash();
		break;
	case 5:
		invertedDimaond();
		break;
	case 6:
		Displaypattern1.rightTriangle();
		break;
	default:
		System.out.println("Wrong choice!!!");
	}
	System.out.println("Exit program!!");
	input.close();
	
}
}
