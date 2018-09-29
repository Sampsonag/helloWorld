package mooc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> compose = new ArrayList<String>();
		Scanner reader = new Scanner(System.in);
		
		
		//System.out.println("Type a word: ");
		//String input = reader.nextLine();
		
		//compose.add(input);
		
		while (true) {
			
			System.out.println("Type a word: ");
			String input = reader.nextLine();
			
			compose.add(input);
			
			if(input.equals("")) {
				break;
			}
			
		}
		
		Collections.reverse(compose);
	
		for(String output: compose) {
			System.out.println(output);
		}
		
		
		

	}

}
