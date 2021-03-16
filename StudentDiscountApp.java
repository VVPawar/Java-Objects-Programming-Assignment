//10) WAP to create the pojo class name as Student class with a following methods and data or variable/state

import java.util.*;

class Student{ 

	int id;
	String name;
	int per;
	int totalFees;
	int disFees;
	int actualPaidFees;
	void setId(int id){ 

		this.id=id;
 
	}
	int getId(){ 
		
		return id;
		
	}
	void setName(String name){ 

		this.name=name;

	}
	String getName(){ 
 
		return name;
 
	}
	void setPer(int per){
		
		this.per = per;
		
	}
	int getPer(){
		
		return per;
		
	}
	void setTotalFees(int totalFees){
		
		this.totalFees = totalFees;
		
	}
	int getTotalFees(){
		return totalFees;
	}
	void setDisFees(int disFees){
		
		this.disFees=disFees;
		
	}
	int getDisFees(){
		
		return disFees;
		
	}
	void setActualPaidFees(int actualPaidFees){
		
		this.actualPaidFees=actualPaidFees;
		
	}
	int getActualPaidFees(){
		
		return actualPaidFees;
		
	}
	//do setter and getter for all students

}
/*
As well as we need to define two another method in this class name as checkDiscountEligibility(int 
per) -> this function accept the per of student if per greater than 60 then student is eligible for 
discout and give the 30% discount on fees and update in student object 
And we need to write one more function in DiscountFees class show() and in this function contain 
the logics for display the all details of Students with discounted fees
*/

class DiscountFees{
	
	Student student;
	void setStudent(Student student){
		this.student=student;
	}
	void checkDiscountEligilibility(int per){
		//here compare per with 60 and get student total fees using getter method
		//store in disFees variable usign setter method
		//then perform actualpaidfees = totalfees-disfees and store in
		//student object usign setter method
			if(per >= 60){
				
				int disFees = ((student.getTotalFees())*30)/100;
				int actualPaidFee = (student.getTotalFees())-disFees;
				student.setDisFees(disFees);
				student.setActualPaidFees(actualPaidFee);
			}
			else{
				int disFees = 0;
				int actualPaidFee = student.getTotalFees();
				student.setDisFees(disFees);
				student.setActualPaidFees(actualPaidFee);
			}
	}
	void show(){
		
		//show here student details usign a getter method
		System.out.println(" Student Id : "+(student.getId())+"\n Student Name : "+(student.getName())+"\n Student percentage : "+(student.getPer()));
		System.out.println("\n Student Total Fees : "+(student.getTotalFees())+"\n Student Discount Fees : "+(student.getDisFees())+"\n Student Actual Paid Fees : "+(student.getActualPaidFees()));
	
	}
	
}

public class StudentDiscountApp{

	public static void main(String x[ ]){
	
		//create the object of Scanner class
			Scanner sc = new Scanner(System.in);
			
		//declare the variables for id,name ,per,totalFees,per and accept the input and store its value in variable usign scanner
			System.out.println("Enter the name of student");
			String name = sc.nextLine();
			
			System.out.println("Enter the ID number of student");
			int id = sc.nextInt();
			
			
			
			System.out.println("Enter the percentage of student");
			int per = sc.nextInt();
			
			System.out.println("Enter the total fees for student");
			int totalFees = sc.nextInt();
			
		//create the object of student class and store the values in object using setter methods
			Student std = new Student();
			std.setId(id);
			std.setName(name);
			std.setPer(per);
			std.setTotalFees(totalFees);
			
		//create the object of DiscountFees class and call setStudent() method and pass student class reference in it
			DiscountFees DF = new DiscountFees();
			DF.setStudent(std);
			
		//call the checkDiscountEligilibility() method and pass per in it accepted from keyboard
			DF.checkDiscountEligilibility(per);
			
		//call show() method here
			DF.show();
	}

}