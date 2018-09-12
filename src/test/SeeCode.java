package test;

import java.util.ArrayList;

public class SeeCode {
	
	public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
	
	public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print(".");
            i++;
        }
    }
	
	public static void printTriangle(int size) {
		
		int count = 0;
		int base = 0;
		int space = size;
		while(count < size) {
			
			printWhitespaces(space-1);
			printStars((count*2)-1);
			
			space--;
			count++;
		}
		if(space == 0) {
			space = size/2;
			count = size/2;
			
			while (base < 2) {
			printWhitespaces(space);
			printStars((count*2)-1);
			base++;
			}
			
		}
		
		
	}
	

public static void main(String[] args) {
	
	printTriangle(5);
	


}
}
//
//	try {
//		int result = divideInt(10,5);
//		System.out.format("10 Divided by 5 is , ", result);
//		divideInt(10,0);
//		System.out.format("10 divided by 0 is ," , result);
//		
//	}
//	catch(IllegalArgumentException ex){
//		System.out.println(ex.getMessage());
//		
//	}
//}
//
//public static int divideInt(int i , int j) {
//	if (j == 0) {
//		//throw new RuntimeException("Higher ranked runtime  exception"); // Experimenting with exception classes// exceptions cannot be run together as they would be unreachable
//		//throw new ArithmeticException("Higher ranked exception"); // Experimenting with exception classes
//		throw  new IllegalArgumentException("Divisor cannot be zero!");
//	}
//	return i/j;
//	
//
//	

//{	
//		ArrayList<Integer>  items = new ArrayList<Integer> ();
//		
//		items.add(1);
//		items.add(2);
//	//	items.add("String");
//		
//		printDoubled(items);
//	
//		
//	}

//private static void printDoubled(ArrayList<Integer>  n) {
//
//	
////	for (int i=0; i < array.length; i++) {
////	    System.out.println("Element: " + array[i]);
////	}
////	to the newer form
////
////	for (String element : array) {
////	    System.out.println("Element: " + element);
////	}
//	
//	//remember the note for (int myValue : myArray)  : can be read as in
//
//	
//	
//	for(Integer i : n) {
//		System.out.println(i*2);
//		//System.out.println(i*2);
//	}
//}
//}
