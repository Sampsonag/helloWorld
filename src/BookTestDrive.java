
public class BookTestDrive {

	public static void main(String[] args) {

		Books[] myBooks = new Books[3];// Empty array of books we still must add references to books below
		
		int x = 0;
		myBooks[0] = new Books(); // without this code the program will have an empty array
		myBooks[0].Title = "The Grapes of Java";
		myBooks[0].setAuthor("bob");
		
		System.out.println(myBooks[0].Title);
		System.out.println("by");
		System.out.println(myBooks[0].getAuthor());

	}

}
