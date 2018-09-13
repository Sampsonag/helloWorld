package test;

import java.util.ArrayList;

public class SeeCode {
	   // static variable 
    static int a = m1(); 
      
    // static block 
    static { 
        System.out.println("Inside static block"); 
    } 
      
    // static method 
    static int m1() { 
        System.out.println("from m1"); 
        return 20; 
    } 
      

  
  

	

public static void main(String[] args) {
	
	 
	       System.out.println("Value of a : "+a); 
	       System.out.println("from main"); 
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
