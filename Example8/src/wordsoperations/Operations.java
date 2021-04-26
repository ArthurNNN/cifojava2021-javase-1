package wordsoperations;

public class Operations {

	public static void print(String wordToPrint) {
		System.out.print(wordToPrint);
	}

	public static void print(char charToPrint) {
		System.out.print(charToPrint);
	}
	
	public static void print(int intToPrint) {
		System.out.print(intToPrint);
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
		lineBreak();
	}

	public static void printStringVertical(String wordToPrint) {
		int i = 0;
		while (i < wordToPrint.length()) {
			print(wordToPrint.charAt(i));
			lineBreak();
			i++;
		}
	}

	public static void printStringDiagonal(String wordToPrint) {
		int i = 0;
		int j = 0;
		while (i < wordToPrint.length()) {
			print(wordToPrint.charAt(i));
			lineBreak();
			j = i + 1;
			while (j > 0) {
				print("  ");
				j--;
			}
			i++;
		}
	}
}