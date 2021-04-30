package accountoperations;

import java.util.ArrayList;
import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		
		ArrayList<String> users = new ArrayList<String>();	
		
		Scanner reader = new Scanner(System.in);
		

		System.out.println("Write user (name and surname) to create Acount:");
		String s = reader.nextLine();

		AccountlManagment.createAccount(s);
				
		System.out.println("\nBuy buy my friends...");
		reader.close();
	}
	
	

}
