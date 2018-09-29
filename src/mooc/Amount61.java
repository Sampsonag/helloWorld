package mooc;

import java.util.ArrayList;
import java.util.Scanner;

public class Amount61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		Scanner reader = new Scanner(System.in);
		
		list.add("Hallo");
		list.add("Ciao");
		list.add("Hello");
		System.out.println("There are this many items in the list:");
		System.out.println(countItems(list));
		

	}

	public static int countItems(ArrayList<String> list) {
		int count = 0;
		for(String test: list) {
			count++;
		}
		
		return count;
	}
	
}
