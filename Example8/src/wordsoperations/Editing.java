package wordsoperations;

public class Editing {
//	public static void subEditing(String wordToEdit) {
//
//		System.out.println("Substring form 3 to end:");
//		Operations.print(wordToEdit.substring(3));
//		Operations.lineBreak();
//		System.out.println("Substring form 3 to 6:");
//		Operations.print(wordToEdit.substring(3, 6));
//		Operations.lineBreak();
//		System.out.println("First position of @:");
//		Operations.print(wordToEdit.indexOf('@'));
//	}

	public static void printEmailString(String s) {
		int spacePosition = s.indexOf(' ');
		String email = (s.substring(0, spacePosition) + s.substring(spacePosition+1)).toLowerCase() + "@java.com";
		System.out.println(email);
		// TODO Auto-generated method stub
		
	}
}
