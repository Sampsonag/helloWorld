package mooc;

public class Product73 {
	
	//Referenced in main 21
	
	double price;
	
	double amount;
	
	String name;

	/**
	 * @param price
	 * @param amount
	 * @param name
	 */
	public Product73(String nameAtStart, double priceAtStart, int amountAtStart) {  // This reminds me of constructor chaining using this()
		super();
		this.price = priceAtStart;
		this.amount = amountAtStart;
		this.name =  nameAtStart;
	}
	
	public void printProduct() {
		
		System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
	}
	

}
