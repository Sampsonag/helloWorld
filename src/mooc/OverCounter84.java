package mooc;

public class OverCounter84 {

	int startingValue;
	boolean check;
	int number;
	
	OverCounter84(){
		//this.startingValue = 0;
		//this.check = false;
		this(0,false);
	}
	
	
	OverCounter84(int startingValue){
		this(startingValue,false);
	}

	
	OverCounter84(boolean check){
		this(0,true);
	}

	OverCounter84(int startingValue , boolean check){
		
		this.number = startingValue;
		this.check = check;
		
	}
	
	public int value() {
		return this.number;
	}
	
	public void increase() {
		number++;
	}
	
	public void increase( int value) {
		
		if( value > 0) {
		
			this.number++;
			
		}
	}
	
	public void decrease() {
		
		number--;
		
		
	}
	
	public void decrease(int value) {
		if(check == false) {
			number = number - value;
		}else if(value < 0) {
				
			number = number - 0;
			
		}else if(check == true && number < 0) {
			number = number - 0;
		}
	
	
	
}
}
