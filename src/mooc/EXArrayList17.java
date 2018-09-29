package mooc;

import java.util.ArrayList;

public class EXArrayList17 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String NormalArray[] = new String[6];
		int NormalArray2[] = {3,6,4,6,5};
		
		ArrayList<String> wordList = new ArrayList<String>();
		
		wordList.add("First");
		wordList.add("Second");
		wordList.add("third");
		wordList.add("fourth");
		
		System.out.println(" Output first entry " + wordList.get(0));
		
		System.out.println("the number of entries is " + wordList.size());
		
		System.out.println("Removing " + wordList.remove("Second"));
		
		if(wordList.contains("third")) {
			System.out.println("heres the third");
		}else {
			System.out.println("not the third");
		}
		
		
		// shuffling through an arraylist
		
	//	ArrayList<Integer> Ex = new ArrayList<Integer>();
		//Morning Aaron think about calling methods as Foo(String theArgument); but calling methods from other classes would be Bar.Foo(String theArgument);
		
		int place = 0;
		while(place < wordList.size()) { // iterate through the list
		System.out.println(wordList.get(place)); // by index number
		place++;// always remember to iterate on your loops or you will infinite loop
		}
		
		for(String words: wordList) { // enhanced for loop , notice how the loop takes care of the indexing, now we can print our new variable words instead of get
			
			System.out.println(words);// every item becomes the value of the variable on the right side
		}
		
		
		

	}

}
