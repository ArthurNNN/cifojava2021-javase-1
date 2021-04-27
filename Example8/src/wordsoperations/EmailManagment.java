package wordsoperations;

import java.util.Random;
import java.util.Scanner;

public class EmailManagment {

	public static void createAccount(String s) {
		// scope #26
		// testRandom();
		createUser(s);
		createEmail(createUser(s));
		createPassword();
		printUserAccount(s);

		// TODO Auto-generated method stub


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

	private static String createUser(String s) {
		// TODO Auto-generated method stub
		int spacePosition = s.indexOf(' ');
		String userLogin = (s.substring(0, spacePosition) + s.substring(spacePosition + 1)).toLowerCase();
		return userLogin;
	}

	private static String createEmail(String s) {
		// TODO Auto-generated method stub
		String email = s + "@java.com";
		return email;
	}

	private static void printUserAccount(String s) {
		// TODO Auto-generated method stub


		System.out.print("Your user login: ");
		System.out.print(createUser(s));
		Operations.lineBreak();

		System.out.print("Your email: ");
		System.out.print(createEmail(createUser(s)));
		Operations.lineBreak();
		System.out.print("Your password: ");
		System.out.print(createPassword());
		Operations.lineBreak();
	}

	private static String createPassword() {
		// TODO Auto-generated method stub
		String password = "";
		int count = 0;
		while (count < 2) {
			int n = createIntRandom(100);

			String j = createCharsRandom();
			password = password + n + j;
			count++;
		}

		return password;
	}

}
