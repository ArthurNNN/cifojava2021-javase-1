package accountoperations;

public class AccountCreating {

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

	public static String createPassword() {
		// scope #7

		String password = "";

		password = password + Utils.createCharRandom() + Utils.createIntRandom(10000)
		+ Utils.createCharRandom() + Utils.createCharRandom()
				+ Utils.createIntRandom(596);

		return password;
	}

	public static void printUserAccount(String user, String email, String password) {
		// scope #8

		System.out.println("User Account: ");
		System.out.println("User : " + user);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);

	}

	public static String accountToString(String user, String email, String password) {

		String accountToString = user + "-" + email + "-" + password;

		return accountToString;

	}

}
