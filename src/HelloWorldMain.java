
public class HelloWorldMain {
 public static void main(String[] args) {

	 int number = 1;
	 System.out.println("Main program variable" + number);
	 addThree(number);
	 System.out.println("Main program variable" + number);
	 
	 
 }
 
 
 
 public static void addThree(int number) { 
	 System.out.println("Method program variable" + number);
	 number = number + 3;
	 System.out.println("Method program variable" + number);
	 
 }
}
