package mooc;

public class EXMethods14 {
	
	 public static void main(String[] args) {
		 
		 //hey Aaron its me variable visibility here to discuss when you can and can't see me(cue John Cena), You got to pass variables around with arguments Morty arguements (burp)
		 // and if you want to return info you need that return type, methods are balck boxes aaron, theydo things but without arguments passed in here() or return statements they remain black... boxes
		 // great reminder variables passed to methods are just copies!!!!
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
