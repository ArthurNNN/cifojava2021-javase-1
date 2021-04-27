package wordsoperations;

import java.util.Random;
import java.util.Scanner;

public class EmailManagment {

	public static void createAccount(Scanner reader) {
		// TODO Auto-generated method stub

		System.out.println("Write your name and surname:");
		String s = reader.nextLine();
		Operations.lineBreak();
		int spacePosition = s.indexOf(' ');
		String email = (s.substring(0, spacePosition) + s.substring(spacePosition+1)).toLowerCase() + "@java.com";
		System.out.println("Your email/login:");
		System.out.println(email);
		
		
		String password = "";
		int count = 0;
		while (count < 2) {
			int n = createIntRandom(100);
 
			String j = createCharsRandom();
			password = password + n + j;
			count++;
		}
		System.out.println("Your password:");
		System.out.println(password);
		Operations.lineBreak();


	}

	private static int createIntRandom(int top) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return rand.nextInt(top);
	}

	public static String createCharsRandom() {

		String alphabetChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String alphabetChars2 = "·$%&|/*+-=()[]{}?¿_:;¨^ºª'@#~€¬!¡`";
		char s1 = alphabetChars.charAt(createIntRandom(alphabetChars.length()));
		char s2 = alphabetChars2.charAt(createIntRandom(alphabetChars2.length()));
		return "" + s1 + s2;
	}

}
