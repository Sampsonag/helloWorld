package mooc;

public class PrintBox40 {
	
	public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
	
	public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print(".");
            i++;
        }
    }
	
	public static void printTriangle(int size) {
		
		int count = 0;
		int base = 0;
		int space = size;
		while(count < size) {
			
			printWhitespaces(space-1);
			printStars((count*2)-1);
			
			space--;
			count++;
		}
		if(space == 0) {
			space = size/2;
			count = size/2;
			
			while (base < 2) {
			printWhitespaces(space);
			printStars((count*2)-1);
			base++;
			}
			
		}
		
		
	}
}
