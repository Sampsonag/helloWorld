package mooc;

import java.util.ArrayList;



public class Length65 {

	public static void main(String[] args) {
		
		
	    ArrayList<String> list = new ArrayList<String>();
	    list.add("Hallo");
	    list.add("Moi");
	    list.add("Benvenuto!");
	    list.add("badger badger badger badger");
	    ArrayList<Integer> lengths = lengths(list);

	    System.out.println("The lengths of the Strings: " + lengths);
	}

	private static ArrayList<Integer> lengths(ArrayList<String> list) {
	
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		int i = 0;
		int size = 0;
		while ( i < (list.size())){
			
		
		size = list.get(i).length();
		
		count.add(size);
		i++;
		
		}
		
		return count;
	}

}
