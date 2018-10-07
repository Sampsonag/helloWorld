package mooc90;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
	

    WeightWatchersAssociation23 weightWatcher = new WeightWatchersAssociation23("Kumpulan paino", 25);

    ExPerson matti = new ExPerson("Matti");
    matti.setWeight(86);
    matti.setHeight(180);
    weightWatcher.addAsMember(matti);

    ExPerson juhana = new ExPerson("Juhana");
    juhana.setWeight(64);
    juhana.setHeight(172);
    weightWatcher.addAsMember(juhana);

    ExPerson harri = new ExPerson("Harri");
    harri.setWeight(104);
    harri.setHeight(182);
    weightWatcher.addAsMember(harri);

    ExPerson petri = new ExPerson("Petri");
    petri.setWeight(112);
    petri.setHeight(173);
    weightWatcher.addAsMember(petri);

    System.out.println( weightWatcher );
		
	}
	    
}
	        
	/*   // Excersie 89
	    public static void main(String[] args) {
	        Clock89 clock = new Clock89(23, 59, 50);

	        int i = 0;
	        while( i < 20) {
	            System.out.println( clock );
	            clock.tick();
	            i++;
	    
	}
	    }
	*/   	
		
/*
// Student88
 ExPerson martin = new ExPerson("Martin", 24, 4, 1983);

   ExPerson juhana = new ExPerson("Juhana", 17, 9, 1985);

   System.out.println( martin );
   System.out.println( juhana );

ArrayList<Student88> list = new ArrayList<Student88>();

Scanner reader = new Scanner(System.in);Student88 student = null;


while(true) {

	
System.out.println("Name");

String name = reader.nextLine();
if(name.isEmpty()) { // is empty is a method Aaron it can replace foo.equals("");
	break;
}

System.out.println("Student Number");
String studentNumber = reader.nextLine();

//student = new Student88(name,studentNumber);

list.add(new Student88(name,studentNumber));// each new object is created without the need for type or name as its going right into the list, i'm just calling its constrcutro
}

	for(Student88 st: list) {
		System.out.println(st);
	}

	
	System.out.println("Give search term");
	String searchTerm = reader.nextLine();
	System.out.println("result");
	
	
	for(Student88 st: list) {
		//String studentName = st.getName();
		//if(studentName.contains("st")){
		if(st.getName().contains("st"))
			System.out.println(st);
		
	}
	
	
	
	
	
	System.out.println("");
   System.out.print("Give search term: ");
   String userSearch = reader.nextLine();
   System.out.println("Result: ");
   
   for (Student88 std : list) {
       String studentName = std.getName();
       if (studentName.contains(userSearch)) {
           System.out.println(std);
       
           
       }
       
       }
   
   */
    


