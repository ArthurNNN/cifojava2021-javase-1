package listoperations;

import java.util.ArrayList;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> fruits = new ArrayList<String>();

		fruits.add("kiwi");
		fruits.add("mango");
		fruits.add("platano");
		fruits.add("manzana");
		fruits.add("cereza");
		
		fruits.add("fresa");

		System.out.print("fruit... ");
		System.out.println(fruits.size());
		System.out.print("Is empty?... ");
		System.out.println(fruits.isEmpty());

		


		
		printArray(fruits);
		
		System.out.println("Does it contain 'fresa'?... " + fruits.contains("fresa"));
		
		fruits.clear();
		
		System.out.print("fruit... ");
		System.out.println(fruits.size());
		System.out.print("Is empty?... ");
		System.out.println(fruits.isEmpty());
		printArray(fruits);

	}

	public static void printArray(ArrayList<String> arrayToPrint) {

		for (String f : arrayToPrint) {

			System.out.print("fruit: ");
			System.out.println(f);
		}

	}

}
