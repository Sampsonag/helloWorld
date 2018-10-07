package mooc90;

import java.util.ArrayList;

public class Student88 {
	
	private String name;
	private String studentNumber;

	/**
	 * @param name
	 * @param studentNumber
	 */
	public Student88(String name, String studentNumber) {
		super();
		this.name = name;
		this.studentNumber = studentNumber;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public String getStudentNumber() {
		return this.studentNumber;	
	}
	
	public String toString() { // 
		return "The student name is:  " + this.name  + " the student number is " + this.studentNumber;
		
	}
	
	//public void addStudent(Student88 student) {
	//	list.add(student);
	//}
	
	
	
	
	

}
