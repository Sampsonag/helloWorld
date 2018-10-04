package mooc;

public class NumberStatistics79 {
	
	    private int amountOfNumbers;
	    private int stats;

	    public NumberStatistics79() {
	        // initialize here the object variable amountOfNumbers
	    	amountOfNumbers = 0;
	    	stats = 0;
	    }

	    public void addNumber(int number) {
	        // code here
	    	stats = stats + number;
	    	amountOfNumbers++;
	    }

	    public int amountOfNumbers() {
	    	return amountOfNumbers;
	        // code here
	    }
	    
	    
	    public int sum() {
	    	
	    	
	    	return stats;
	    }

	    public double average() {
	       return stats / amountOfNumbers;
	    }
	}
	  


