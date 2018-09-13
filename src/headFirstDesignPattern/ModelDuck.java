package headFirstDesignPattern;

import duckBehaviors.FlyNoWay;
import duckBehaviors.Quack;
import duckBehaviors.Squeak;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
		
	}

}
