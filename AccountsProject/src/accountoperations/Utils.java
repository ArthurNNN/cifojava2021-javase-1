package accountoperations;

import java.util.Random;

public class Utils {
	
	public static int createIntRandom(int top) {
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
