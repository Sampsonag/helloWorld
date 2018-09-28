package mooc;

public class Methods14 {
	
	 public static void main(String[] args) {

		 int number = 1;
		 System.out.println("Main program variable: " + number);
		 addThree(number);
		 System.out.println("Main program variable: " + number);
		 
		 int catchTen = alwaysReturnTen();// since i'm in the same class I dont have foo.alwaysReturnTen
		 System.out.println(catchTen);
		 
	 }
	 
	 
	 
	 public static void addThree(int number) { // main passes a copy of number but without a return once we return to main the number has not changed, pass by reference
		 System.out.println("Method program variable: " + number);
		 number = number + 3;
		 System.out.println("Method program variable: " + number);
	 }
	 
	 	public static int alwaysReturnTen() {
	 		return 10;
	 	}
	 
	 
}
