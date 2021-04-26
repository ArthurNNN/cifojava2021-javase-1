package Wordsoperations;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Write some string ...");
		String word = reader.nextLine();
		
		Operations.printStringHorizontal(word);
		Operations.lineBreak();
		Operations.printStringVertical(word);
		Operations.lineBreak();
		Operations.printStringDiagonal(word);
		Operations.lineBreak();

		
		System.out.println("Buy buy my friends...");
	}
	
	

}
