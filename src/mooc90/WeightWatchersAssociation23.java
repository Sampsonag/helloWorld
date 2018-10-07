package mooc90;

import java.util.ArrayList;

public class WeightWatchersAssociation23 {
	
	private double lowestWeightIndex;
	  private String name;
	    private ArrayList<ExPerson> members;
	
	public WeightWatchersAssociation23(String name,double indexLimit) {
		
		
        this.lowestWeightIndex = indexLimit;
        this.name = name;
        this.members = new ArrayList<ExPerson>(); 
    }
	
	 public boolean isAccepted(ExPerson person) {
	        if ( person.weightIndex() < this.lowestWeightIndex ) {
	            return false;
	        }

	        return true;
	    }
	 
	 public void addAsMember(ExPerson person) {
	        if ( !isAccepted(person) ) { // same as isAccepted(person) == false
	            return;
	        }

	        this.members.add(person);
	    }

	    public String toString() {
	        String membersAsString = "";

	        for ( ExPerson member : this.members ) {
	            membersAsString += "  " + member.getName() + "\n";
	        }

	        return "Weightwatchers association " + this.name + " members: \n" + membersAsString;
	    }

}
