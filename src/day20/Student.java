package day20;
// wrapping together variables and methods inside a class - Encapsulation

// 1. Declare private variable. 2. 

public class Student {

	private String name;
	private int roll;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

}
