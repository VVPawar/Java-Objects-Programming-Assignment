//5.WAP program create the class name as Sum with a following methods 
import java.util.*;

class Sum{
	
	void calSum(int ...x) 		//method with var-args
	{

		//here we need to calculate the sum of all elements
		
		int sum_elements=0;
		for(int i : x){
			
			sum_elements = sum_elements + i;
			
		}
		System.out.println("Sum of given elements : "+sum_elements);
		
	}

}
public class SumApplication{ 
	
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		//here we need to create the object of Sum class and call the calSum() method and pass 
		//parameter in it 
		Sum s = new Sum();
		s.calSum(100,50);
		s.calSum(30,40,50);
		System.out.println("Enter Size of array ");
		int size = sc.nextInt();
		System.out.println(" Enter Array ");
		int a[] = new int[size];
		for(int i = 0;i < size;i++){
			
			a[i] = sc.nextInt();
			
		}
		s.calSum(a);
	}
	
}