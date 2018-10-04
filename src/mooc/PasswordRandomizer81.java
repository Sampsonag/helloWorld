package mooc;

import java.util.Random;

public class PasswordRandomizer81 {
	
	int length;
    // Define the variables here
	Random randomGen;
	String output = "";

    public PasswordRandomizer81(int length) {
        this.length = length;
       this.randomGen  = new Random();
    }

    public String createPassword() {
      // Write the code here which returns the new password
    	 int count = 0;
    	while (count < length) {
    	char symbol = "abcdefghijklmnopqrstuvwxyz".charAt((randomGen.nextInt(25))+1);
    	output = output + symbol;
    	count++;
    	}
    	
    	return output;
    }
}