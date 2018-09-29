package mooc;

import java.util.ArrayList;
import java.util.Scanner;

public class Words57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> words = new ArrayList<String>();
		Scanner reader = new Scanner(System.in);
		
		
	while(true) {
			System.out.println("Type in a name, type in a blank if you want to stop typing names.");
			
			String word = reader.nextLine();
			
			words.add(word);
			if(word.isEmpty()) {
				break;
				}
			}
	
		System.out.println("you type3d in the following words: ");
		for(String loop: words) {
			System.out.println(loop);
		}
			
		}
		
		

	}


