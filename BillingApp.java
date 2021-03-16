//11).WAP to create the class name as Product with a following properties 

import java.util.*;

class Product{

	private int id;
	private String name;
	private int qty;
	private int rate; 
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
	public void setQty(int qty){
		
		this.qty=qty;
		
	}
	public int getQty(){
		
		return qty;
		
	}
	public void setRate(int rate){
		
		this.rate = rate;
		
	}
	public int getRate(){
		
		return rate;
		
	}
	//write the setter getter
	// for qty and rate

}

/*Create the another class name as CalculateBill and this class is depend on product but we want to 
pass more than one product details to CalculateBill class so here we use the var-args concept.
*/

class CalculateBill{

	void calBill(Product ...p){
		int Total = 0,count = 0; 
		for(Product i : p){
			Total = Total + (i.getRate())*(i.getQty());
			count++;
		}
		int TotalBill[] = new int[count];
		System.out.println("ProductID\tProductName\tQty\tRate\tTotalBill");
		int j = 0;
		for(Product i : p){
			
			//TotalBill[j]=0;
			TotalBill[j] =(i.getRate())*(i.getQty());
			if(j==2){
				System.out.printf("\n"+i.getId()+"\t\t"+i.getName()+"\t  "+i.getQty()+"\t"+i.getRate()+"\t"+TotalBill[j]);
			}
			else{
				System.out.printf("\n"+i.getId()+"\t\t"+i.getName()+"\t\t  "+i.getQty()+"\t"+i.getRate()+"\t"+TotalBill[j]);
			}
			j++;	
			
		}
		System.out.println("\n\t\t\t\t______________________________\n\t\t\t\t\tTotal Bill : "+Total);
		
		//in this funcation we can fetch all product using a looping eith the help of array
		//using a getter method and calculate its total bill
	
	}
	/*void show(Product ...p){
		
		for(Product i : p){
			
			System.out.println(" Customer name : "+(i.getName())+"\n Customer ID : "+(i.getId())+"\n quantity of Product : "+(i.getQty())+"\n Rate of Product : "+(i.getRate()));
		
		}
		
	}*/
}

public class BillingApp{
	
	public static void main(String x[]){
		int id;
		String name;
		int qty;
		int rate; 
		Product p1 = new Product(),p2 = new Product(),p3 = new Product();
		p1.setId(1);
		p1.setName("Parle");
		p1.setQty(10);
		p1.setRate(5);
		
		p2.setId(2);
		p2.setName("Cadbury");
		p2.setQty(10);
		p2.setRate(10);
		
		p3.setId(3);
		p3.setName("Britania");
		p3.setQty(10);
		p3.setRate(10);
		//hear we need to create the more than one object of product class and set data in it
		
		CalculateBill c = new CalculateBill();
		c.calBill(p1,p2,p3);
		//c.show(p1,p2,p3);
		//we need to create the object of CalculateBill class and pass all product object in CalculateBill class	
		
	}
	
}