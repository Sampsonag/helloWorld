package mooc;

import java.util.Scanner;

public class Main21 {
	
	public static void main(String[] args) {
		
		PasswordRandomizer81 pr = new PasswordRandomizer81(13);
		
		
		System.out.println(pr.createPassword()); 
		
	}
	}
		
//Question 80
//Dice80 dice = new Dice80(6);
//
//int i = 0;
//while ( i < 10 ) {
//    System.out.println( dice.roll() );
//    i++;
//
//
//}
//}

		
//	// Question 79	
//		 NumberStatistics79 stats = new NumberStatistics79();
//		 NumberStatistics79 statsEven = new NumberStatistics79();
//		 NumberStatistics79 statsOdd = new NumberStatistics79();
//		 Scanner reader = new Scanner(System.in);
//		  int input;
//		 
//		 
//			
//			 
//		 
//		 while (true) {
//			 
//			 input = reader.nextInt();
//			 
//			 if(input == -1) {
//				 break;
//			 }else if(input % 2 == 0) {
//				 
//				 statsEven.addNumber(input);
//				 
//			 }else {
//				 statsOdd.addNumber(input);
//				 
//			 }
//			 
//			 
//			  stats.addNumber(input);
//			 
//			 
//			 
//		 }
//		 System.out.println("sum: " + stats.sum());
//		 System.out.println("sum: " + statsEven.sum());
//		 System.out.println("sum: " + statsOdd.sum());
//		 
//	      
//	    }
//	    }
//		
//	
//		
//	 // question 78  
//    Scanner reader = new Scanner(System.in);
//    BoundedCounter78 seconds = new BoundedCounter78(59);
//    BoundedCounter78 minutes = new BoundedCounter78(59);
//    BoundedCounter78 hours = new BoundedCounter78(23);
//
//    System.out.print("seconds: ");
//    int s = reader.nextInt();
//    System.out.print("minutes: ");
//    int m =  reader.nextInt();
//    System.out.print("hours: ");
//    int h =  reader.nextInt();// read the initial value of hours from the user
//
//    seconds.setValue(s);
//    minutes.setValue(m);
//    hours.setValue(h);
//
//    int i = 0;
//    while ( i < 600 ) {
//    	seconds.next();
//    	
//    	if(seconds.getValue() == 00) {
//        	minutes.next();
//        }
//        
//        if(minutes.getValue() == 00) {
//        	hours.next();
//        }
//     //   if(hours.getValue() == 23)
//        // advance minutes
//        // if minutes become zero, advance hours
//        	
//        i++;
//        
//        System.out.println( hours + ":" + minutes   + ":" + seconds);
//    }
//}
		
		
		/*
		Person21 Tom = new Person21("Tom");
		
		Tom.printPerson();
		
		int i = 0;
        while ( i < 30 ) {
            Tom.becomeOlder();
            i++;
        }

        Tom.becomeOlder();

        System.out.println("");

        if ( Tom.isAdult() ) {
            System.out.print("adult: ");
            Tom.printPerson();
        } else {
            System.out.print("minor: ");
            Tom.printPerson();
        }

        if ( Tom.isAdult() ) {
            System.out.print("adult: ");
            Tom.printPerson();
        } else {
            System.out.print("minor: ");
            Tom.printPerson();
        }
        
        System.out.println(Tom);
        System.out.println(Tom.toString());
        
        
        LyyraCard76 card = new LyyraCard76(10);
        System.out.println("Pekka: " + card);
        card.loadMoney(-15);
        System.out.println("Pekka: " + card);
        
        
        Person21 matti = new Person21("Matti");
        Person21 john = new Person21("John");

        matti.setHeight(180);
        matti.setWeight(86);

        john.setHeight(175);
        john.setWeight(64);

        System.out.println(matti.getName() + ", body mass index: " + String.format("%.2f", matti.bodyMassIndex()));
        System.out.println(john.getName() + ", body mass index: " + String.format("%.2f", john.bodyMassIndex()));
        
      */  
        
		
		
//		//For question 73
//		
//		Product73 t = new Product73("Banna", 74, 500);
//		
//		t.printProduct();
// 
//		
//		
//		//For question 74
//		
//		 Multiplier74 u = new  Multiplier74(50);
//		 
//		 u.multiply(100);
//		 
//		 
//		 //For question 75
//		 
//		 Decreasing75 counter = new Decreasing75(10);
//
//	        counter.printValue();
//
//	        counter.decrease();
//	        counter.printValue();
//
//	        counter.decrease();
//	        counter.printValue();
//		 
//		 //Question 76
//	        
//	        Menu76 food = new Menu76();
//	        
//	        food.addMeal("Hamburger");
//	        
//	        food.addMeal("Taco");
//	        
//	        food.printMeals();
//	        
//	        food.clearMenu();
//	        
//	        food.printMeals();
//		}
        
        // question 76
       
	
	
//}
