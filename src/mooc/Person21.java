package mooc;

public class Person21 {
	
	private String name; // private only showing inside the object
    private int age;
	/**
	 * @param name
	 * @param age
	 */
	public Person21(String name) {
		super();
		this.name = name;
		this.age = 0;
	}
    
	 public void printPerson() {
	        System.out.println(this.name + ", age " + this.age + " years");
	    }

}
