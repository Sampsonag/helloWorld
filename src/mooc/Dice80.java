package mooc;

import java.util.Random;

public class Dice80 {
    private Random random;
    private int numberOfSides;

    public Dice80(int numberOfSides){
        this.numberOfSides = numberOfSides;
        random = new Random();

    }

    public int roll() {
    	int num;
    	num = (random.nextInt(this.numberOfSides) + 1);
    	
    	return num;
          
    }
}