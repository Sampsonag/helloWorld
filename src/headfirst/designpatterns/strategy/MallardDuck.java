package headfirst.designpatterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Squeak();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
	
public void testing(){
	
	System.out.println("test");
	
}


	
	
}

