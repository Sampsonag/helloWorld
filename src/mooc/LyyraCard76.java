package mooc;

public class LyyraCard76 {

	private double balance;

	public LyyraCard76(double balanceAtStart) {
		// write code here

		this.balance = balanceAtStart;
	}

	public String toString() {
		// write code here

		return "The card has" + this.balance + " euros";
	}

	public double balance() {
		return this.balance;
	}

	public void payEconomical() {

		if (this.balance < 2.50) {

		} else {
			this.balance = this.balance - 2.50;

		}
	}

	public void payGourmet() {

		if (this.balance < 4.00) {

		} else {
			this.balance = this.balance - 4.00;

		}
	}

	public boolean pay(double amount) {
		// the method checks if the balance of the card is at least the amount given as
		// parameter
		// if not, the method returns false meaning that the card could not be used for
		// the payment
		// if the balance is enough, the given amount is taken from the balance and true
		// is returned

		if (amount < balance) {

			this.balance = this.balance - amount;
			return true;
		} else {
			return false;
		}

	}

	public void loadMoney(double amount) {

		if (amount < 0) {

		} else {
			this.balance += amount;
		}

		if (this.balance > 150) {
			this.balance = 150;
		}
	}

}
