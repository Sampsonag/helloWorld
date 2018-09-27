package test;

import java.util.ArrayList;

class IntClass{ // created so we can pass the arraylist a class but this is ineffective
	 private int myValue;

	/**
	 * @param myValue
	 */
	public IntClass(int myValue) {
		super();
		this.myValue = myValue;
		
		
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
	
	
}

public class AutoBoxMain {
	
	public static void main (String[] args) {
	String [] strArray = new String[10];
	int [] intArray = new int[10];
	
	ArrayList<String> strArrayList = new ArrayList<String>();// works because string is a class , array list must be passed a class
	strArrayList.add("Tom");
	
	ArrayList<IntClass> exBadArrayList= new ArrayList<IntClass>();
	exBadArrayList.add(new IntClass(54));// adds an object which in this class is the constructor call or new object new Intclass 54

	Integer integer = new Integer(5);// example of using the integer class
	
	
	//IntClass ex = new IntClass(3); // Playin with calling the non private variables
	//System.out.println(ex.myValue);
	
	ArrayList<Double> dbArrayList = new ArrayList<Double>();
	for(double i: dbArrayList) {
		dbArrayList.add(Double.valueOf(i));// value of converts to class in question
	}
	
	for(double i: dbArrayList) {
		System.out.println(i + " -- >" + dbArrayList.get((int) i).doubleValue());
	}
	
	
	Integer myIntValue = 56; // Java willautobox for you
	int myInt = myIntValue;
	
	
	
	
	}
	
	
	
	

}
