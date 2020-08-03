package day19;

import java.util.Scanner;

public class Test {

	public static void getAnimalBehavior(Animal animal) {

		if (animal instanceof Tiger) {
			animal.makeSound();
			((Tiger) animal).kissDeer();
		} else {

			if (animal instanceof Dog) {
				animal.makeSound();
				((Dog) animal).eats();
			}
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice: ");
		String choice = input.next();
		Animal animal = null;
		switch (choice) {
		case "dog": {
			animal = new Dog();
			break;
		}

		case "tiger": {
			animal = new Tiger();
			break;
		}
		default:
			System.out.println("Invalid choice!!!");
			break;
		}
		if (animal != null) {

			Test.getAnimalBehavior(animal);
		}
		input.close();
	}

}