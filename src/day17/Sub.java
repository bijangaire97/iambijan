package day17;

public class Sub extends Super {
	public Sub() {

		System.out.println("Child's default constructor....");
	}

	public Sub(int a) {
		super(5);
		System.out.println("Child's default constructor with int input....");

	}

}
