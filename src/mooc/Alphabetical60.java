package mooc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Alphabetical60 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		ArrayList<String> words = new ArrayList<String>();
		
		while(true) {
			
			System.out.println("Type a word");
			String input = reader.nextLine();
			words.add(input);
			
			if(input.isEmpty()) {// inseated of checing if the string is empty we use the method is empty
				break;
			}
			
		}
		
		Collections.sort(words);
		for(String output: words) {
			System.out.println(output);
		}

	}

}
