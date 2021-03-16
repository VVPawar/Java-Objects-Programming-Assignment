//12).WAP to create the class name as Player with a setter and getter method with a Player details.

import java.util.*;

class Player{
	
	private int id;
	private String name;
	private int runs;
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){ 
		return id;
	}
	public void setName(String name){ 
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setRuns(int runs){
		this.runs=runs;
	}
	public int getRuns(){ 
		return runs;
	}
}

/*
Create the one more class name as Team and pass Player objects in Team class using a var-args 
concept and show the Player details in Team class.
Then we need to create the class with a main method and write the code with a following logics
*/

class Team{

	void addPlayers(Player ...p){
		System.out.println("\nPlaye ID\tPlaye Name\tPlaye Runs");
		for(Player i : p){
			
			System.out.println(i.getId()+"\t\t"+i.getName()+"\t"+i.getRuns());
			
		}
		//here we can fetch the playerusing a looping with array of objects and show it.
		
	}
	
}

public class TeamApplication{
	
	public static void main(String x[]){
		
		//Crate the object of Team class and create the more than one objects of player classs
		Team t = new Team();
		Player p1 = new Player(), p2 = new Player(), p3 = new Player();
		
		p1.setId(1);
		p1.setName("Rohit Sharma");
		p1.setRuns(100);
		
		p2.setId(2);
		p2.setName("Virat Kohli");
		p2.setRuns(60);
		
		p3.setId(3);
		p3.setName("Rishabh Pant");
		p3.setRuns(50);
		
		//call the addPlayers() method of Team class and pass the player objects in addPlayers() method and show it.
		t.addPlayers(p1,p2,p3);
	
	}
	
}