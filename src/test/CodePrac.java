package test;

import java.util.ArrayList;
import java.util.Arrays;

public class CodePrac {
	
	

	public static void main(String[] args) {
		
		ArrayList listTest = new ArrayList();
		
		
		listTest.get(1);
		
		int myValue = 10;
		int anotherIntValue = myValue;
		
		
		int[] myIntArray = new int[5];
		int[] anotherArray = myIntArray;
		
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("anotherArray = " + Arrays.toString(anotherArray));
		
	}
	

	
	public void test(ArrayList listTest){
	
		listTest.add("Only object");
		listTest.add(2);
		
	}
	
	
}
