package Wordsoperations;

public class Operations {

	public static void print(String wordToPrint) {
		System.out.print(wordToPrint);
	}
	
	public static void print(char charToPrint) {
		System.out.print(charToPrint);
	}

	public static void lineBreak() {
		System.out.print("\n");
	}

	public static void printStringHorizontal(String wordToPrint) {
		int i = 0;
		lineBreak();
		while (i < wordToPrint.length()) {
			print(wordToPrint.charAt(i));
			print(' ');
			i++;
		}
	}
	
	public static void printStringVertical(String wordToPrint) {
		int i = 0;

		while (i < wordToPrint.length()) {
			print(wordToPrint.charAt(i));
			lineBreak();
			i++;
		}
	}
	

}