package mooc;

import java.util.ArrayList;

public class Menu76 {

    private ArrayList<String> meals;

    public Menu76() {
       this.meals =  new ArrayList<String>();
       
    }
    
    
    public void addMeal(String meal) {
    	
    if(!this.meals.contains(meal))	{
    	 this.meals.add(meal);
    }
    	
    
    	
    	
    	
    }
    
    public void printMeals() {
    	
    	for(String x: this.meals){
    		System.out.println(x);
    	}
    	
    }
    
    public void clearMenu()	{
    	this.meals.clear();
    }

    
    
    // Implement the methods here
}
