package mooc;

import java.util.ArrayList;
import java.util.Collections;

public class Greatest66 {
	
	public static int greatest(ArrayList<Integer> list) {
		
		int big = Collections.max(list); // could have also compared them one by one or sorted and sysout the top.
		
		
		
		return big;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   ArrayList<Integer> list = new ArrayList<Integer>();
		    list.add(3);
		    list.add(2);
		    list.add(7);
		    list.add(2);

		    System.out.println("The greatest number is: " + greatest(list));

	}

}
