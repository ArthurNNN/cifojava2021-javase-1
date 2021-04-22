package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Tell me your name");
		String userName = reader.nextLine();
		
		System.out.println("Tell me your type of user");
		String userType = reader.nextLine();

		System.out.println("Tell me amount of your buy");
		String amountBuy = reader.nextLine();
		
		System.out.println("User: /n");
		System.out.println("------------------------------------");
		System.out.println("User Name: " + userName);
		System.out.println("User Type: " + userType);
		System.out.println("Amount buy: " + amountBuy);
		
		
	}

}
