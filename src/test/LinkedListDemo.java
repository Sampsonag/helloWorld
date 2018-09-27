package test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> placesToVisit = new LinkedList<String>();

		placesToVisit.add("austin");
		placesToVisit.add("Dallas");
		placesToVisit.add("San antonio");

		placesToVisit.add("Canberra");
		printList(placesToVisit);

		placesToVisit.add(1, "Houston");// placed Houston in 1 moving everything back
		printList(placesToVisit);

		placesToVisit.remove(4);
		printList(placesToVisit);

	}

	static void printList(LinkedList<String> linkedList) { // placing arguments the types will matching to

		Iterator<String> i = linkedList.iterator();// Allows you to transtion through the program
		while (i.hasNext()) {
			System.out.println("Now visiting" + i.next());
		}

		System.out.println("===========");

	}
	
	
private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();
		
		while(stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			if(comparison == 0) {
				//equal, do not add
				System.out.println(newCity + "is alread included as a destionation");
				return false;
			}else if (comparison > 0 ) {
			
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			}
		}
		return false;
	}

}
