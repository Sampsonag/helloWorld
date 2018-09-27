package headFirstDesignPattern;

import duckBehaviors.FlyWithWings;
import duckBehaviors.MuteQuack;
import duckBehaviors.Quack;

// what is /. in java

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		
		quackBehavior = new Quack();  // used the quack class to handle its quack.
		flyBehavior = new FlyWithWings();
		
		
	}

	@Override
	public void display() {
	System.out.println("I'm a real Mallard Duck");
		
	}
	
	

}
