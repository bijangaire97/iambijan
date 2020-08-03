package day19;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("dog barks!!!");
	}

	public void eats() {
		System.out.println("Eats meat.");
	}

}
