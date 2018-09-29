package mooc;

import java.util.ArrayList;

public class EXGoodHabits {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(3);
		numbers.add(7);
		numbers.add(3);
		System.out.println("The numbers in the beginning:");
		for (int number : numbers) {
			System.out.println(number);
		}
		while (numbers.contains(Integer.valueOf(3))) {
			numbers.remove(Integer.valueOf(3));
		}
		System.out.println("The numbers after removal:");
		for (int number : numbers) {
			System.out.println(number);
		}
		
		

	}
}


//The orignal sin in programming is repeating code , break it up if needed

// format code for readability