package test;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();// Arraylist has bracket due to the consttuctor, remember = new is a call to a constructor
    private ArrayList<Integer> shopList = new ArrayList<Integer>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    
    public void addShopItem(Integer num) {
    	shopList.add(num);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    
    public void printShopList() {
    	System.out.println("You have" + shopList.size() + "number of items");// Arraylist have size method
    	for(int i  : shopList) {// no number initialize on enhanced for loop
    		System.out.println((i+1) + " . " +  shopList.get(i));  // arraylist.get for arraylist items
    	}
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
        
    }
    
    public void modifyShopList(int position, int newItem) {
    	shopList.set(position, newItem);
    	System.out.println("Item modified at position" + (position+1) );
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }


public void removeShopList(int position) {
	
	shopList.remove(position);
	System.out.println("Item removed");
}

public int findItem(int findItem) {
	boolean exists = shopList.contains(findItem);
	
	int position = shopList.indexOf(findItem);
	
	if(position >= 0) {
		return shopList.get(position);
	}
	return 0;
}
 


}
