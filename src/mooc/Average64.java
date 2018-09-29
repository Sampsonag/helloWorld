package mooc;

import java.util.ArrayList;

public class Average64 {
	
	
	public static double average(ArrayList<Integer> sum) {
		double output = 0;
		double count = 0;
		for(int token: sum) {
			output = output + token;
			count++;
		}
		
		output = output /count;
		
		
		return output;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The average is: " + average(list));
	}
	 
}
