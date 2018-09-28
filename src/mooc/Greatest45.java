package mooc;

public class Greatest45 {
	
	public static int greatest(int number1, int number2, int number3) {
		int total = 0;
	   if(number1 > number2 || number1 > number3) {
		   
		   total = number1;
	   }else if(number2 > number1 || number2 > number3) {
		   total = number2;
	   }else if(number3 > number3 || number1 > number2) {
		   total = number3;
	   }
	   
	   return total;
	}

	public static void main(String[] args) {
	    int answer =  greatest(2, 7, 3);
	    System.out.println("Greatest: " + answer);
	}
	    

}
