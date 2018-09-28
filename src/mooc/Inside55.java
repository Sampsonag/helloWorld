package mooc;

import java.util.Scanner;

public class Inside55 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type the first word: ");
		String word1 = reader.nextLine();
		
		System.out.println("Type the second word: ");
		String word2 = reader.nextLine();
		
		int index = word1.indexOf(word2);
		
		
		
		System.out.println("The word " + word1.substring(index) + " is found in the word " + word1);
		
		
		//System.out.println(word.substring(start,word.length()));
		
		


	}



}
