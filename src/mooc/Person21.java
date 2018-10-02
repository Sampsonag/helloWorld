package mooc;

public class Person21 {
	
	private String name; // private only showing inside the object
    private int age;
    
    private int weight;
    private int height;

	 /**
	 * @param name
	 * @param age
	 * @param weight
	 * @param height
	 */
	public Person21(String initialName) {//Aaron if the constructor demands input you must provide it
		super();
		this.name = initialName;
		this.age = 0;
		this.weight = 0;
		this.height = 0;
	}

	public void printPerson() {
	        System.out.println(this.name + ", age " + this.age + " years");
	    }
	 
	 
	 public void becomeOlder() {
	        this.age = this.age + 1;
	    }
	 
	   public boolean isAdult(){
	        if ( this.age < 18 ) {
	            return false;
	        }

	        return true;
	    }
	   
	   public String toString() { // instead of printing this returns the method
	        return this.name + ", age " + this.age + " years" + this.bodyMassIndex();
	    }
	   
	   public String getName() {
	        return this.name;
	    }

	    public void setHeight(int newHeight) {
	        this.height = newHeight;
	    }

	    public void setWeight(int newWeight) {
	        this.weight = newWeight;
	    }

	    public double bodyMassIndex(){
	        double heightDividedByHundred = this.height / 100.0;
	        return this.weight / ( heightDividedByHundred * heightDividedByHundred );
	    }

	   
	   

}
