

package mooc90;

public class ExPerson {
	
	private String name; // private only showing inside the object
    private int age;
    
    private int weight;
    private int height;
    private ExMyDate birthMyDate;

	 /**
	 * @param name
	 * @param age
	 * @param weight
	 * @param height
	 */
    
	public ExPerson() {
		this("name",0,0,0); // call the constructor below iitalized as called
		
	}
    
    
	public ExPerson(String initialName) {//Aaron if the constructor demands input you must provide it 
		super(); // we place variables in the constructor if a new object will require them after creation
		this.name = initialName;
		this.age = 0;
		this.weight = 0;
		this.height = 0;
	}
	
	public ExPerson(String initialName, int age) {
		super();
		this.name = initialName;
		this.age = age;
		this.weight = 0;
		this.height = 0;
	}
//	
//	public ExPerson(String initialName, int age, int weight, int height) {
//		super();
//		this.name = initialName;
//		this.age = age;
//		this.weight = weight;
//		this.height = height;
//	}
	
	 public ExPerson(String name, int day, int month, int year) {
	        this.name = name;
	        this.weight = 0;
	        this.height = 0;
	        this.birthMyDate = new ExMyDate(day, month, year);
	    }

	public void printPerson() {
	        System.out.println(this.name + ", age " + this.age + " years");
	    }
	 
	 
	 public void becomeOlder() {
	        this.age = this.age + 1;
	    }
	 
	 public void becomeOlder(int years) {
	        this.age = this.age + years ;
	    }
	 
	   public boolean isAdult(){
	        if ( this.age < 18 ) {
	            return false;
	        }

	        return true;
	    }
	   
	   public String toString() { // instead of printing this returns the method
	        return this.name + ", born " + this.birthMyDate + " years" + this.bodyMassIndex();
	    }
	   
	   public String getName() {
	        return this.name;
	    }

	    public void setHeight(int newHeight) {
	        this.height = newHeight;
	    }

	    public int getHeight() {
	        return this.height;
	    }
	    
	    public void setWeight(int newWeight) {
	        this.weight = newWeight;
	    }
	    
	    public int getWeight() {
	        return this.weight;
	    }
	    
	    public double weightIndex() {
	        double heightInMeters = this.height / 100.0;

	        return this.weight / (heightInMeters * heightInMeters);
	    }

	    public double bodyMassIndex(){
	        double heightDividedByHundred = this.height / 100.0;
	        return this.weight / ( heightDividedByHundred * heightDividedByHundred );
	    }

	    public boolean olderThan(ExPerson compared) {
	        if ( this.age > compared.age ) {
	            return true;
	        }

	        return false;
	    }
	   

}
