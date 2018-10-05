package mooc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main21 {
	
	public static void main(String[] args) {
		
		 ArrayList<Person21> teachers = new ArrayList<Person21>();
		 
		 
		 new Person21("tom");
						 
		//ArrayList<String> example = new ArrayList<String>();
		
	    // first we can take a person into a variable
	    Person21 teacher = new Person21("Juhana");
	    // and then add it to the list
	    teachers.add(teacher);

	    // or we can create the object as we add it:
	    teachers.add( new Person21("Matti") );
	    teachers.add( new Person21("Martin") );

	    System.out.println("teachers as newborns: ");
	    for ( Person21 prs : teachers ) {
	        System.out.println( prs );
	    }

	    for ( Person21 prs : teachers ) {
	        prs.becomeOlder( 30 );
	    }

	    System.out.println("in 30 years: ");
	    for ( Person21 prs : teachers ) {
	        System.out.println( prs );
	    }
	
	}
	}

//		apartment 87		
//		Apartments87 studioManhattan = new Apartments87(1, 16, 5500);
//		Apartments87 twoRoomsBrooklyn = new Apartments87(2, 38, 4200);
//		Apartments87 fourAndKitchenBronx = new Apartments87(3, 78, 2500);
//
//		System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );       // false
//		System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );   // true
//		
//		System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );        // 71600
//		System.out.println( fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );    // 35400
//	
/*
		 //example 23.6
		   Person21 pekka = new Person21("Pekka", 24);
		    Person21 antti = new Person21("Antti", 22);

		    if (pekka.olderThan(antti)) {  //  same as pekka.olderThan(antti)==true
		        System.out.println(pekka.getName() + " is older than " + antti.getName());
		    } else {
		        System.out.println(pekka.getName() + " isn't older than " + antti.getName());
		    }
	*/



		//Excersie 86
//		   CashRegister86 unicafeExactum = new CashRegister86();
//	        System.out.println( unicafeExactum );
//
//	        LyyraCard76 cardOfJim = new LyyraCard76(2);
//
//	        System.out.println("the card balance " + cardOfJim.balance() + " euros");
//
//	        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
//	        System.out.println("payment success: " + succeeded);
//
//	        unicafeExactum.loadMoneyToCard(cardOfJim, 100);
//
//	        succeeded = unicafeExactum.payGourmet(cardOfJim);
//	        System.out.println("payment success: " + succeeded);
//
//	        System.out.println("the card balance " + cardOfJim.balance() + " euros");
//
//	        System.out.println( unicafeExactum );
//	    }
	
	
	
			
//	    LyyraCard76 cardOfPekka = new LyyraCard76(10);
//
//        System.out.println("money on the card " + cardOfPekka.balance() );
//        boolean succeeded = cardOfPekka.pay(8);
//        System.out.println("money taken: " + succeeded );
//        System.out.println("money on the card " + cardOfPekka.balance() );
//
//        succeeded = cardOfPekka.pay(4);
//        System.out.println("money taken: " + succeeded );
//        System.out.println("money on the card " + cardOfPekka.balance() );
//    
	
	
	
		//		//  class 85
//		Reformatory85 eastHelsinkiReformatory = new Reformatory85();
//		
//		 Person21 brian = new Person21("Brian", 1, 110, 7);
//		    Person21 pekka = new Person21("Pekka", 33, 176, 85);
//
//		    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
//
//		    eastHelsinkiReformatory.weight(brian);
//		    eastHelsinkiReformatory.weight(pekka);
//
//		    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
//
//		    eastHelsinkiReformatory.weight(brian);
//		    eastHelsinkiReformatory.weight(brian);
//		    eastHelsinkiReformatory.weight(brian);
//		    eastHelsinkiReformatory.weight(brian);
//
//		    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
//		

//		//practice 23.5
//		
//		   Person21 matti = new Person21("Matti");
//		    matti.setWeight(86);
//		    matti.setHeight(180);
//
//		    Person21 juhana = new Person21("Juhana");
//		    juhana.setWeight(64);
//		    juhana.setHeight(172);
//		    
//		    WeightWatchersAssociation23 kumpulasWeight = new WeightWatchersAssociation23(25);
//		    
//		    if ( kumpulasWeight.isAcceptedAsMember(matti) ) {
//		        System.out.println( matti.getName() + " is accepted as a member");
//		    } else {
//		        System.out.println( matti.getName() + " is not accepted as a member");
//		    }
//
//		    if ( kumpulasWeight.isAcceptedAsMember(juhana) ) {
//		        System.out.println( juhana.getName() + " is accepted as a memberksi");
//		    } else {
//		        System.out.println( juhana.getName() + " is not accepted as a member");
//		    }
//
//		
//		
//	// Excercise 84
//		
//		Person21 Pekka = new Person21("Pekka", 21);
//		System.out.println(Pekka);
//	
/*		// Question 88
//PasswordRandomizer81 pr = new PasswordRandomizer81(13);
//
//
//System.out.println(pr.createPassword()); 
*/	

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
