package mooc;

public class LyyraCard76 {
	
	 private double balance;

	    public LyyraCard76(double balanceAtStart) {
	        // write code here
	    	
	    	this.balance = balanceAtStart;
	    }

	    public String toString() {
	        // write code here
	    	
	    	return "The card has" +  this.balance + " euros";
	    }
	    
	    public void payEconomical() {
	       
	       
	       if(this.balance < 2.50) {
	    	   
	       }else {
	    	   this.balance =  this.balance - 2.50;
	    	   
	       }
	    }

	    public void payGourmet() {
	    	
	    	 if(this.balance < 2.50) {
		    	   
		       }else {
		    	   this.balance =  this.balance - 4.00;
		    	   
		       } 
	    }
	    
	    
	    public void loadMoney(double amount) {
	    	
	    	if(amount < 0) {
	    		
	    	}else {
	    		this.balance += amount;
	    	}
	    	
	    	
	        if(this.balance > 150) {
	        	this.balance = 150;
	        }
	    }
	        
	   

}
