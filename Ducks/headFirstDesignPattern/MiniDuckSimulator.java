package headFirstDesignPattern;

import duckBehaviors.FlyRocketPowered;
import duckBehaviors.Squeak;
import duckInterfaces.FlyBehavior;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.setQuackBehavior( new Squeak());
		mallard.performQuack();
		mallard.display();
		mallard.swim();// accessed through inheritaance
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		
	}

}
