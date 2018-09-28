package mooc;

import java.util.Scanner;

public class Last49 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
				
		System.out.println("Typer your name");
		String input = reader.nextLine();
		char last = lastCharacter(input);
		System.out.println("First Charchter is:  " + last);
		
	}
	
	public static char lastCharacter(String input) {
		
		return input.charAt(input.length()-1);
	}

}
