package mooc;

import java.util.ArrayList;

public class Sum63 {
	
	
	
	public static int sum(ArrayList<Integer> sum) {
		int output = 0;
		
		for(int count: sum) {
			output = output + count;
		}
		
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The sum: " + sum(list));

	    list.add(10);

	    System.out.println("the sum: " + sum(list));

	}

}
