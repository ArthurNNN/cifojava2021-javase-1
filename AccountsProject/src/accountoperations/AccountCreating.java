package accountoperations;


public class AccountCreating {
	
	public static String createUser(String nameAndSurname) {
		// TODO Auto-generated method stub
		int spacePosition = nameAndSurname.indexOf(' ');
		String userLogin = (nameAndSurname.substring(0, spacePosition) + nameAndSurname.substring(spacePosition + 1)).toLowerCase();
		return userLogin;
	}

	public static String createEmail(String login) {
		// TODO Auto-generated method stub
		String email = login + "@java.com";
		return email;
	}

	public static void printUserAccount(String user, String email, String password) {
		// TODO Auto-generated method stub


		System.out.print("Your user login: ");
		System.out.println(createUser(user));
//		Operations.lineBreak();

		System.out.print("Your email: ");
		System.out.println(createEmail(createUser(email)));
//		Operations.lineBreak();
		System.out.print("Your password: ");
		System.out.println(password);
//		Operations.lineBreak();
	}

	public static String createPassword() {
		// TODO Auto-generated method stub
		String password = "";
		int count = 0;
		while (count < 2) {
			int n = Utils.createIntRandom(100);

			String j = Utils.createCharsRandom();
			password = password + n + j;
			count++;
		}

		return password;
	}

}
