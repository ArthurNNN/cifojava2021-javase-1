package accountoperations;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Write user (name and surname) to create Acount:");
		String s = reader.nextLine();

		AccountlManagment.createAccount(s);
		Login.logIn("arturnikitsin 12345678");

		System.out.println("\nBuy buy my friends...");
		reader.close();
	}

}
