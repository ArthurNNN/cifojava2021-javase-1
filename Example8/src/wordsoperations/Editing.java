package wordsoperations;

public class Editing {
	public static void subEditing(String wordToEdit) {

		Operations.print(wordToEdit.substring(3));
		Operations.lineBreak();
		Operations.print(wordToEdit.substring('@'));
	}
}
