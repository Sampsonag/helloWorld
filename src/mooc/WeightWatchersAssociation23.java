package mooc;

public class WeightWatchersAssociation23 {
	
	private double lowestWeightIndex;
	
	public WeightWatchersAssociation23(double indexLimit) {
		
		
        this.lowestWeightIndex = indexLimit;
    }
	
	 public boolean isAcceptedAsMember(Person21 person) {
	        if ( person.weightIndex() < this.lowestWeightIndex ) {
	            return false;
	        }

	        return true;
	    }

}
