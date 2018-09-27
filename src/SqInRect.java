import java.awt.List;
import java.util.LinkedList;

public class SqInRect {
//	<Integer>
public static List sqInRect() {
	
int	lng = 5;
int	wdth = 3;
  
  int area = lng * wdth;
  int total = area;
  int i = 1;
  boolean loop = false;
 
  
  LinkedList<Integer> object = new LinkedList<Integer>(); 
  
  while(total > 0) {
  
	  total = (int) (area - (Math.pow(i,2))) ;
  //while(loop) {
	  if(Math.pow(i,2) > area) {
		  object.add(i--);
		  //loop = true;
		  
		//  break;
	  }
	  //}
 
  
  
  }
 
  for(Object o : object){
	    System.out.println(o);
	}
		// your code
		return null;
	}

public static void main(String[] args) {
	
	SqInRect x = new SqInRect();
	
	SqInRect.sqInRect();
	
	
	
}
}
