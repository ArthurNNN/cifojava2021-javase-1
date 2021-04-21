package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		Person artur = new Person();

		System.out.println("Tell me your name");
		String name = reader.nextLine();

		System.out.println("Tell me your age");
		int age = reader.nextInt();

		System.out.println("Hello " + name);

		if (age > 18) {
			System.out.println(name + " you are an adult!");
		} else {
			System.out.println(name + " you are an children!");
		}

	}

}
