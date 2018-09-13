package headFirstDesignPattern;

import duckInterfaces.FlyBehavior;
import duckInterfaces.QuackBehavior;

//Abstact classes created blueprints but can implement methods, the abstract class is inherited and you must contain at least one abstract class

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display(); // abstract class that must be inherited 
	

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void performFly() {
	flyBehavior.fly();
		
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void performQuack() {
		quackBehavior.quack();
		
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	

}
