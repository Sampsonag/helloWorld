package mooc;

import java.util.ArrayList;

public class Combining70 {
	
	public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
		
		//first.addAll(second);
		
		for(int i : second) {
			first.add(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(4);
		list1.add(3);

		list2.add(5);
		list2.add(10);
		list2.add(7);

		combine(list1, list2);

		System.out.println(list1); // prints [4, 3, 5, 10, 7]

		System.out.println(list2); 

	}

}
