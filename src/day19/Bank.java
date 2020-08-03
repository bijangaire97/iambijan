package day19;

import java.util.Scanner;

public class Bank {

	/*
	 * public static void open(Account account) { account.openAccount(); }
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("What account do you want to open?");
		String choice = input.next();

		Account account = null;

		switch (choice) {

		case "saving":

			account = new SavingAccount();
			break;

		case "current":
			account = new CurrentAccount();
			break;

		default:
			System.out.println("wrong choice..");
			break;

		}
		if (account != null) {
			account.openAccount();
		}
		input.close();
	}
}
