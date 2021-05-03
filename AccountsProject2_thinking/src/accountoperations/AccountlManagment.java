package accountoperations;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AccountlManagment {

	public static String createAccount(String useToCreatAccount) {
		// scope #26
		// testRandom();
		String user = AccountCreation.createUser(useToCreatAccount);
		String email = AccountCreation.createEmail(useToCreatAccount);
		String password = AccountCreation.createPassword();
		AccountCreation.printUserAccount(user, email, password);
		
		String userAndPassword = user + " " + password;

		return userAndPassword;
	}

}