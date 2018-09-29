package mooc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThenOnce68 {
	
	public static boolean moreThanOnce(ArrayList<Integer> list, int num) {
//		boolean result = true; // without using collections
//		int counter = 0;
//		
//		counter = Collections.frequency(list, num);
//		
//		
//		if (counter >= 2 ) {
//			
//			result =true;
//		}else {
//			result = false;
//		}
//		
//		return result;
//		
		
		
		boolean result = true; 
		int counter = 0;
		
		for(int measure: list) {
			
			if(measure == num) {
				counter++;
			}
			
		}
		
	
	if (counter >= 2 ) {
			
		result =true;
	}else {
			result = false;
	}
	
	return result;
	
		
	}
		
	


	public static void main(String[] args) {  Scanner reader = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("Type a number: ");
    int number = Integer.parseInt(reader.nextLine());
    if (moreThanOnce(list, number)) {
        System.out.println(number + " appears more than once.");
    } else {
        System.out.println(number + " does not appear more than once.");
    }
}
}