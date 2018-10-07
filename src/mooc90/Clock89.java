package mooc90;

public class Clock89 {
	 private BoundedCounter78 hours;
	    private BoundedCounter78 minutes;
	    private BoundedCounter78 seconds;

	    public Clock89(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
	      // the counters that represent hours, minutes and seconds are created and
	      // set to have the correct initial values
	    	
	    	hours = new BoundedCounter78(23);
	    	minutes = new BoundedCounter78(59);
	    	seconds = new BoundedCounter78(59);
	    	
	    	hours.setValue(hoursAtBeginning); // got this part but did nopt think to set my intial values, that happens for all object creatios aaron
	    	minutes.setValue(minutesAtBeginning);
	    	seconds.setValue(secondsAtBeginning);
	    
	    }

	    public void tick(){ // struggled with this method and required help
	     seconds.next();
	     if (seconds.getValue() == 0) {
	            minutes.next();
	            if (minutes.getValue() == 0) {
	                hours.next();
	            }
	        }
	    }

	    public String toString() {
	       return "Clock hour: " + this.hours + "Clock minutes" + this.minutes + "clock seconds" + this.seconds;
	    }

}
