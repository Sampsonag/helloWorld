package test;

public class Customer {
	private String name;
	private double balance;
	/**
	 * @param name
	 * @param balance
	 */
	public Customer(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

}
