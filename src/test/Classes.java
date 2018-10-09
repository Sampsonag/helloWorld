package test;

public class Classes {
	

	  public static void main(String[] args) {
	    
	    class User{
	    
	    int score;
	    
	    public boolean hasWon(){
	    
	    if (score >= 100){
	    return true;
	    }else{
	    return false;
	    
	    }
	    
	  }
	  
	    }
	  User bob = new User();
	  
	  bob.score = 10;
	  
	  System.out.println(bob.hasWon());
	  
	}

	}

	  