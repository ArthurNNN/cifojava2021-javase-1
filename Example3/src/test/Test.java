package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		double vipClientDiscount = 25.00;
		double regularClientDiscount = 15.00;
		double newCientDiscount = 00.00;

		while (true) {
			Scanner reader = new Scanner(System.in);
			System.out.println("------------------------------------\n");
			System.out.println("Tell me your name");
			String userName = reader.nextLine();
			

			System.out.println("Tell me your type of user");
			String userType = reader.nextLine();

			System.out.println("Tell me amount of your buy");
			double userBuy = Double.valueOf(reader.nextLine());
//			double userBuy = reader.nextInt();

			System.out.println("\nUser: ");
			System.out.println("---------------------");
			System.out.println("User Name: " + userName);
			System.out.println("User Type: " + userType);
			System.out.println("User Buy: " + userBuy);
			System.out.println("\nTicket:");
			System.out.println("---------------------");	
			
			double discount = 0;
			double totalDiscount = 0;
			double amountToPayWithDis = 0;

			if (userType.equals("vip")) {
				discount = vipClientDiscount;
				System.out.println(userName + " is a vip user");
			} else if (userType.equals("regular")) {
				discount = regularClientDiscount;
			} else if (userType.equals("new")) {
				discount = newCientDiscount;
				System.out.println(userName + " is a new user");
			} else {
				discount = 0;
				System.out.println(userName + " is not a specific user. You have to write new, regular o vip. Please, try another time...");
			}
			
			totalDiscount = userBuy * discount / 100;
			amountToPayWithDis = userBuy - totalDiscount;
			
			System.out.println("The amount of your buy is: " + userBuy);
			System.out.println("Your discount is: " + discount +"%");
			System.out.println("Your total discount is: " + totalDiscount);
			System.out.println("Your should pay: " + amountToPayWithDis + "\n");
			
		}
	}
}
