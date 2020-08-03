package day6;

public class OperatorDemo1 {

	public static void main(String[] args) {
		// Increment/Decrement operator
		//post a++ a-- pahila operation hunchha, then increment
		//pre ++a --a , pahila increment hunchha, then operation
		
		int x = 4;
		System.out.println(x); //4
		System.out.println(x++); //4
		System.out.println(x); //5
		
		int m = 5;
		int n = m++;
		
		System.out.println(m); //6
		System.out.println(n);//5

	}

}
