package mooc;

import java.util.Scanner;

public class First48 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
				
		System.out.println("Typer your name");
		String input = reader.nextLine();
		char first = firstCharacter(input);
		System.out.println("First Charchter is:  " + first);
		
	}
	
	public static char firstCharacter(String input) {
		
		return input.charAt(0);
	}

}
