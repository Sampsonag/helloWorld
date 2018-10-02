package mooc;

public class Decreasing75 {
	
	
	    private int value;   // object variable that remembers the value of the counter
	    private int valueSaved;

	    public Decreasing75(int valueAtStart) {
	        this.value = valueAtStart;
	        this.valueSaved = valueAtStart;
	    }

	    public void printValue() {
	        System.out.println("value: " + this.value);
	    }

	    public void decrease() {
	        // write here the code that decrements the value of counter by one
	    	
	    	
	    	
	    	if(this.value > 0) {
	    		this.value--;
	    	}
	    	else {
	    		
	    	}
	    }
	    
	    public void reset() {
	        // write here the code that decrements the value of counter by one
	    	
	    	
	    	
	    	this.value = 0;
	    }
	    
	    public void setInitial() {
	    	this.value = this.valueSaved;
	    }


	

}
