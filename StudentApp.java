//4. WAP to create the class name as Student with a following methods 
import java.util.*;

class Student
{
	private int[] marks = new int[6];
	private double per;
	
	void setSubMarks(int[] s){ 
	
		//here we need to store the array in instance variable 
		for(int i = 0;i<6;i++){
		
			marks[i]=s[i];
		
		}
		
	}
	
	void calculatePer(){
		
		int total=0;
		//here we need to call the aggregate of six subjects marks through the array and calculate its per and store in instance variable.
		for(int i = 0;i < 6;i++){
			
			total = total + marks[i];
			
		}
		
		per = (total*100)/600;
		
	}	
 
	void checkGrades(){ 
	
		System.out.println("\n  -----------------------------------  \n");	
		//here we need to check grades means per>75 && per<=100 then student in distinction if per>60 
		//&& per<=75 then in first division if per>=50 && per<=60 then second division and if per>40 && 
		//per<=50 then in third division and if per <40 then student failed 
		
		if(per >75 && per <= 100){
			
			System.out.println(" Student in Distinction ");
			
		}
		else if(per > 60 && per <= 75){
			
			System.out.println(" Student in First Division ");
			
		}
		else if(per >= 50 && per <= 60){
			
			System.out.println(" Student in Second Division ");
			
		}
		else if(per > 40 && per <= 50){
			
			System.out.println(" Student in Third Division ");
			
		} 
		else{
			
			System.out.println(" Student failed ");
			
		}
		
	}
	
}

public class StudentApp{
	
	public static void main(String x[]){
		int marks[] = new int[6];
		//create the object of scanner class
		
		  Scanner sc = new Scanner(System.in);
		
		//declare the array with 6 six of type integer and store input values in array as subject marks
			
			System.out.println("Enter the six subjects marks : ");
			for(int i = 0;i < 6;i++){
				
				marks[i]= sc.nextInt();
			
			}
		//create the object of Student class and call the setSubMarks() function and pass array in it
		//then call calculatePer() student function
		//then call checkGrades() function for checking the grading of students.
		
			Student s = new Student();
			s.setSubMarks(marks);
			s.calculatePer();
			s.checkGrades();
			
	}
}