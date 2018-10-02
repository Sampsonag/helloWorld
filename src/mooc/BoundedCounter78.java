package mooc;

public class BoundedCounter78 {
	   private int value;
	    private int upperLimit;
	   
	    public BoundedCounter78(int upperLimit) {
	    	
	    	this.upperLimit = upperLimit;
	    	this.value = 0;
	    	
	        // write code here
	    }

	    public void next() {
	        // write code here
	    	
	    	value++;
	    	
	    	if (this.value > this.upperLimit) {
	    		this.value = 0;
	    	}
	    	
	    }

	    public String toString() {
	        // write code here
	    	
	    	if(value < 10) {
	    	    return "0" + value;
	    	}else {
	    	    return "" + value;
	    	}
	    }
	    
	    public int getValue() {
	        return this.value;
	    }
	    
	    public void setValue(int value) {
	        this.value = value;
	    }
}
