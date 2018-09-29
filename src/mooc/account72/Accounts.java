package mooc.account72;

public class Accounts {

	  public static void main(String[] args) {
	        Account bartosAccount = new Account("Barto's account" , 100);
	        bartosAccount.deposit(20.0);
	        bartosAccount.toString();
	        
	        Account mattAccount = new Account("Matt's account", 1000);
	        mattAccount.withdrawal(100);
	        Account myAccount = new Account("My account", 0);
	        myAccount.deposit(100);
	        mattAccount.toString();
	        myAccount.toString();
	        
	        
	        Account A = new Account("A", 100);
	        Account B = new Account("B", 0);
	        Account C = new Account("C", 0);
	        
	        Account.transfer(A, B, 0);
	  
	        
	      
	        
	    }
	  
	  
	  
}
