package accountoperations;

import java.util.Random;
import java.util.Scanner;

public class AccountlManagment {

	public static void createAccount(String useToCreatAccount) {
		// scope #26
		// testRandom();
		String user =AccountCreating.createUser(useToCreatAccount);
		String email = AccountCreating.createEmail(useToCreatAccount);
		String password = AccountCreating.createPassword();
		AccountCreating.printUserAccount(user, email, password);

		// TODO Auto-generated method stub

	}

}