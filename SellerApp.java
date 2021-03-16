//9.WAP to create the class name as Seller with a following functions
import java.util.*;

class Seller{
	private int sp,cp;
	void acceptSellingCostPrice(int sp,int cp){ 
		
		//here we need to store the sp and sp values in instance variable
		this.sp = sp;
		this.cp = cp;
		
	}
	
	void showProfitLoss(){ 
		
		//here we need to write the logics for profit and lossint i=0;
		int i=0;
		if(i < sp - cp){
			
			System.out.println("\n profit : "+(sp-cp));
			
		}
		else if(i == sp - cp){
			
			System.out.println("\n Neither a profit nor a loss means Break-even : 0");
			
		}
		else{
		
			System.out.println("\n loss : "+(cp-sp));
		
		}

	}
}

class SellerApp{ 
	
	public static void main(String x[]){
	
		//here we need to create the object of Scanner class 
		
		Scanner sc = new Scanner(System.in);
		
		//declare the two values sp and cp and store values in it using scanner
		
		System.out.println("enter the cost price ");
		int cp = sc.nextInt();
		
		System.out.println("enter the selling price");
		int sp = sc.nextInt();
		
		
		
		//create the object of Seller class
		
		Seller s = new Seller();
		
		//call its acceptSellingCostPrice function and pass two values in it
		
		s.acceptSellingCostPrice(sp,cp);
		
		//call the showProfitLoss() function
		
		s.showProfitLoss();
	
	}
	
}