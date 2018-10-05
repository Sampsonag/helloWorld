package mooc;

public class CashRegister86 {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister86() {
        // at start the register has 1000 euros
    	
    	cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
    	
    	if(cashGiven < 2.50) {
    		return cashGiven;
    	} else {
    		cashInRegister += cashGiven;
    		economicalSold++;
    		return (cashGiven - 2.50);
    	}
    	
    	
    }

    public double payGourmet(double cashGiven) {
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to the register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
    	
    	
    	if(cashGiven < 4.00) {
    		return cashGiven;
    	} else {
    		cashInRegister -= cashGiven;
    		gourmetSold++;
    		return (cashGiven - 4.00);
    	}
    		
    }
    

    public boolean payEconomical(LyyraCard76 card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    	boolean answer = card.pay(2.50);
    	if(card.balance() > 2.50) {
    		economicalSold++;
    		card.payEconomical();
    		return answer;
    	}else {
    		economicalSold++;
    		return answer;
    	}
    	
    }

    public boolean payGourmet(LyyraCard76 card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    	
    	boolean answer = card.pay(4.00);
    	if(card.balance() > 4.00) {
    		gourmetSold++;
    	//	card.payGourmet();
    		return answer;
    	}else {
    		gourmetSold++;
    		return answer;
    	}
    }
    
    public void loadMoneyToCard(LyyraCard76 card, double sum) {
    	   card.loadMoney(sum);
    	}

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
  
