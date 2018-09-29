package mooc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Palindrome69 {
	
	public static boolean palindrome(String text) {
	    // write your code here
		boolean answer;
		String reverse = "";
		int i = 1;
		while (i <=  text.length()) {
			
			
			reverse = reverse + text.charAt(text.length()-i);
			i++;
		}
		
		
		//System.out.println(reverse);
		
		
		
		
		if(reverse.equals(text)) {
			answer = true;
		}else {
			answer = false;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
	
		  Scanner reader = new Scanner(System.in);

		    System.out.println("Type a text: ");
		    String text = reader.nextLine();
		    if (palindrome(text)) {
		       System.out.println("The text is a palindrome!");
		    } else {
		       System.out.println("The text is not a palindrome!");
		    }
		}
	
}