package mooc;

import java.util.ArrayList;
import java.util.Scanner;

public class Recurring58 {
	
	static Scanner reader = new Scanner(System.in);
	
	

	
	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		
	
	
		while (true) {
			System.out.println("Type a word, type the word twice to quit");
			
			
			String index = reader.nextLine();
			if(!words.isEmpty()) {
				if(words.contains(index)) {
					words.add(index);
					break;
				}
				}
			
			words.add(index);
			
			
			
			
		}
		System.out.println("You gave the word " + words.get(words.size()-1) + " twice");
		
		
		
	}
	
	

}

//How to declare a string like an object, like it is because strings are objects aaron
//	String Banna = new String("Banna");