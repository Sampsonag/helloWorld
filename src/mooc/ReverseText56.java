package mooc;

import java.util.Scanner;

public class ReverseText56 {
	static Scanner reader = new Scanner(System.in);
	
	//How to declare a string like an object, like it is because strings are objects aaron
	
	String Banna = new String("Banna");
	
	public static String reverse(String text) {
	    // write your code here
		
		String help = "";
		
		for (int i = (text.length() - 1); i >=0; i--) {
			help = help + text.charAt(i);
			
		}
		
		
		return help;
	}

	public static void main(String[] args) {
	    System.out.print("Type in your text: ");
	    String text = reader.nextLine();
	    System.out.println("In reverse order: " + reverse(text));
	}
	/*
	 * Iterate over the array Backward!!
	 * 
	 *http://www.techiedelight.com/iterate-string-backwards-java/
	 *    
	 */

}

