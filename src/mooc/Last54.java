package mooc;

import java.util.Scanner;

public class Last54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type a word: ");
		String word = reader.nextLine();
		System.out.println("Length of the first part");
		int end = reader.nextInt();
		int start = word.length()- end;
		
		System.out.println(word.substring(start,word.length()));
		
		


	}

}
