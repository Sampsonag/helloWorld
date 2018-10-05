package mooc;

public class Apartments87 {
	
	 private int rooms;
	    private int squareMeters;
	    private int pricePerSquareMeter;

	    public Apartments87 (int rooms, int squareMeters, int pricePerSquareMeter){
	        this.rooms = rooms;
	        this.squareMeters = squareMeters;
	        this.pricePerSquareMeter = pricePerSquareMeter;
	    }
	    
	    public boolean larger(Apartments87 otherApartment){
	    	
	    	if(this.squareMeters > otherApartment.squareMeters) {
	    		return true;
		    	 }else {
		    		 return false;
		    	 }
	    	
	    	
	    }
	    	
	    
	    
	   public int priceDifference(Apartments87 otherApartment){
		   int apart1 = this.squareMeters * this.pricePerSquareMeter;
		   int apart2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
		   
		   int apartDiff = apart1 - apart2;
		   
		   return Math.abs(apartDiff);
	    }	
	   
	   public boolean moreExpensiveThan(Apartments87 otherApartment) {
		   
		   if(this.squareMeters * this.pricePerSquareMeter > otherApartment.squareMeters * otherApartment.pricePerSquareMeter) {
			   return true;
		   }else {
			   return false;
		   }
		   
	   }
	    	

}
