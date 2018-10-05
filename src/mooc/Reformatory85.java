package mooc;

public class Reformatory85 {
	
	private int weightCounter = 0;
	
	 public int weight(Person21 person) {
	       // returns the weight of the parameter
		 int weight = person.getWeight();
		 
		 weightCounter++;
	       return weight;
	    }
	 
	 public void feed(Person21 person) {
	 person.setWeight(person.getWeight() + 1);
	 }
	 
	 public int totalWeightsMeasured() {
		return this.weightCounter;
	 }

}
