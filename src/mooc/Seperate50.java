package mooc;

import java.util.Scanner;

public class Seperate50 {
	
	static int count = 0;
	
	public static void main(String[] args) {
		
	
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Type your name");
	
	String input = reader.nextLine();
	
	if(input.length() >= 2 ) {
	
	for(int i = 0; i < 3; i++) {
		count = i;
		count++;
		System.out.println( count +". character: " + input.charAt(i));
		
	}
	
	
	}
	}
	 

}
