package mooc;

import java.util.Scanner;

public class Length47 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
				
		System.out.println("Type your name");
		String input = reader.nextLine();
	
		
		int number = calculateCharacters(input);
		System.out.println("Number of charchters: " + number );
	}
	
	 public static int calculateCharacters(String input) {
			
			
			
		 return  input.length();
	 }

}
