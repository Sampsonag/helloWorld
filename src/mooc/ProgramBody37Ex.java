package mooc;

public class ProgramBody37Ex {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		greet("tom");
		greetManyTimes("Vanessa",3);

	}
	
	public static void greet(String name) {
		System.out.println("Greetings from the world of methods" + name);
		
		
	}
	
	public static void  greetManyTimes(String name, int times) {
		int i = 0;
		
		while(i < times) {
			greet(name);
			i++;
		}
		
	}

}
