package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			double userBuy = reader.nextInt();

			System.out.println("\nUser: ");
			System.out.println("---------------------");
			System.out.println("User Name: " + userName);
			System.out.println("User Type: " + userType);
			System.out.println("User Buy: " + userBuy);
			System.out.println("\nTicket:");
			System.out.println("---------------------");			

			if (userType.equals("vip")) {

				System.out.println("The amount of your buy is: " + userBuy);
				System.out.println("Your discount is: " + vipClientDiscount +"%");
				System.out.println("Your total discount is: " + userBuy * vipClientDiscount / 100);
				userBuy = userBuy * (1 - vipClientDiscount / 100);

			} else if (userType.equals("regular")) {

				System.out.println("The amount of your buy is: " + userBuy);
				System.out.println("Your discount is: " + regularClientDiscount+"%");
				System.out.println("Your total discount is: " + userBuy * regularClientDiscount / 100);
				userBuy = userBuy * (1 - regularClientDiscount / 100);

			} else if (userType.equals("new")) {
				System.out.println("The amount of your buy is: " + userBuy);
				System.out.println("Your discount is: " + newCientDiscount+ "%");
				System.out.println("Your total discount is: " + userBuy * newCientDiscount / 100);
				userBuy = userBuy * (1 - newCientDiscount / 100);

			} else {
				
				System.out.println(userName + " is not a specific user");
				System.out.println("The amount of your buy is: " + userBuy);
				System.out.println("Your discount is: " + "0%");
			}
			
			System.out.println("Your should pay: " + userBuy + "\n");
			
		}
	}
}
