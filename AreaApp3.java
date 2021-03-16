//3. WAP to create the class Employee with a following methods

import java.util.*;

class Employee{
	private int id,basicSal,progress;
	private double Total,incremental;
	private String name;
	void setPersonalInfo(String name,int id,int basicSal) { 
		
		//in this function we need to store name ,id and basicSal in instance variable
		this.id	= id;
		this.basicSal = basicSal;
		this.name = name;
	}

	void setProgressPer(int progress){
		
		//if progress value is greater than 60 per then increase the basic salary of employee with 30 percentage.
		
		//int progressS = 70;
		
		if(progress > 60 ){
			
			incremental = (basicSal * 30)/ 100;
			
		}
		System.out.println("\n-----------------------------------------\n");
	}

	void show(){

		//in this function we need to show the all details of employee like as 
		//name id and basic salary as well as incremental salary and total salary of employee
		Total = incremental + basicSal;
		System.out.println("Name of Employee : "+name+"\nID of Employee : "+id+"\nBasic Salary of Employee : "+basicSal+"\nIncremental Salary of Employee : "+incremental+"\nTotal Salary of Employee : "+Total);
	}

}
public class AreaApp3{
	
	public static void main(String x[]){
			
		// here create the object of Scanner class and accept the name id and basic salary as well 
		//progress per value not need to calculate it by using formual directly enter e.g 70 
		//means 70%
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Employee : ");
		String name = sc.nextLine();
		System.out.println("Enter ID of Employee : ");
		int id = sc.nextInt();
		System.out.println("Enter Basic Salary of Employee : ");
		int basicSal = sc.nextInt();
		System.out.println("Enter Progress of Employee : ");
		int progress = sc.nextInt();
		
		//create the object of Employee class and call setPersonalInfo and pass name id and salary in 
		//it as well as setProgressPer() and pass progress value in it
		//call the show() method of Employee class.
		
		Employee emp = new Employee();
		emp.setPersonalInfo(name,id,basicSal);
		emp.setProgressPer(progress);
		emp.show();

	}

}