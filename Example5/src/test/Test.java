package test;

import java.util.Scanner;

public class Test {
	
	final static double vipClientDiscount = 25.00;
	final static double regularClientDiscount = 15.00;
	final static double newCientDiscount = 00.00;
	final static double taxValue = 21.00;

	public static void main(String[] args) {

		clientBuyProcess();
	}

	static void clientBuyProcess() {

		while (true) {

			Scanner reader = new Scanner(System.in);
			System.out.println("------------------------------------\n");
			System.out.println("Tell me your name");
			String userName = reader.nextLine();
			System.out.println("Tell me your type of user");
			String userType = reader.nextLine();
			System.out.println("Tell me amount of your buy");
			double userBuy = Double.valueOf(reader.nextLine());

			System.out.println("\nUser: ");
			System.out.println("---------------------");
			System.out.println("User Name: " + userName);
			System.out.println("User Type: " + userType);
			System.out.println("User Buy: " + userBuy);

			double discount = 0;

			if (userType.equals("vip")) {
				discount = vipClientDiscount;
				printTicket(discount, userBuy);
			} else if (userType.equals("regular")) {
				discount = regularClientDiscount;
				printTicket(discount, userBuy);
			} else if (userType.equals("new")) {
				discount = newCientDiscount;
				printTicket(discount, userBuy);
			} else {
				System.out.println("Please, you have to write 'new', 'regular' o 'vip'. Please, try another time...");
			}
		}
	}

	private static void printTicket(double discount, double userBuy) {

		double totalDiscount = userBuy * discount / 100;
		double amountToPay = userBuy - totalDiscount;

		System.out.println("\nTicket:");
		System.out.println("---------------------");
		System.out.println("The amount of your buy is: " + userBuy);
		System.out.println("Your discount is: " + discount + "%");
		System.out.println("Your total discount is: " + totalDiscount);
		System.out.println("Your should pay (with discount): " + amountToPay);
		System.out.println("Your should pay (with taxes): " + addTax(amountToPay));
	}

	private static double addTax(double amountToPay) {
		return amountToPay * (1 + taxValue / 100);
	}
}
