package wordsoperations;

public class Editing {
	public static void subEditing(String wordToEdit) {

		System.out.println("Substring form 3 to end:");
		Operations.print(wordToEdit.substring(3));
		Operations.lineBreak();
		System.out.println("Substring form 3 to 6:");
		Operations.print(wordToEdit.substring(3, 6));
		Operations.lineBreak();
		System.out.println("First position of @:");
		Operations.print(wordToEdit.indexOf('@'));
	}

}
