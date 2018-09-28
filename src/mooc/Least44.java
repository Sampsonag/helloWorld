package mooc;

public class Least44 {
	
	public static int least(int number1, int number2) {
	    // write program code here
	    // do not print anything inside the method
		int total = 0;
		if(number1 < number2) {
			total = number1;
			
		}else if(number2 > number1) {
			
			total = number2;
		}
		return total;

	    // method needs a return in the end
	}

	public static void main(String[] args) {
	    int answer =  least(2, 7);
	    System.out.println("Least: " + answer);
	}
	    

}
