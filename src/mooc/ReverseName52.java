package mooc;

import java.util.Scanner;

public class ReverseName52 {
	
	static int num = 1;
	
	public static void main(String[] args) {
		
	
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Type your name");
	
	String input = reader.nextLine();
	
	int counter = 0;
	
	int max = (input.length()-1);
	
	for(int i = 0; counter < input.length(); i++) {
		
		System.out.println( num +". character: " + input.charAt(max));
		max--;
		counter++;
		num++;
		
	}
	
	
	}
	
	 



}
