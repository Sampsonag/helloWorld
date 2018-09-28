package mooc;

public class Guess41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int guess = 5;
		int random = 7;
		int count = 0;
		
		king:while (true) {// without this label I may need guess == random at the bottom of the if/else chart
		
		System.out.println("Guess a number");
		count++;
		
		if(guess == random) {
			System.out.println("Congratulations, your guess is correct!");
			break king;
		}else if(guess > random) {
			System.out.println("The number is lesser, guesses made:" + + count);
			count ++;
		}else if(guess < random) {
			System.out.println("The number is greater,guesses made:" + count);
			count++;
		}
		
		}
		

	}
	
	//public static int game() {
		
		
		
		
	//}

}
