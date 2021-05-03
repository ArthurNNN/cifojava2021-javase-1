package accountoperations;

public class AccountCreation {

	public static String createUser(String nameAndSurname) {

		int spacePosition = nameAndSurname.indexOf(' ');
		String userLogin = (nameAndSurname.substring(0, spacePosition) + nameAndSurname.substring(spacePosition + 1))
				.toLowerCase();
		return userLogin;
	}

	public static String createEmail(String login) {

		String email = login + "@java.com";
		return email;
	}

	public static void printUserAccount(String user, String email, String password) {
		// TODO Auto-generated method stub

		System.out.println("Account data:");
		System.out.println("Login: " + user);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);

	}

	public static String createPassword() {

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
