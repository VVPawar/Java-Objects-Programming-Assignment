//8.WAP to create the class name as ArrayFeqCount with a following methods
import java.util.*;

class ArrayFeqCount{ 

	int c[],count;
	
	void setIntArray(int ch[]){ 
		
		//here accept the integer array and store in instance variable in integer array
		c=ch;
	
	}
 
	void countFeqCount(){
	
		//here we need to write the manual logics for inserting value on specified index in arr
		for(int i=0;i<c.length;i++){
			
			count=0;
			for(int j=0;j<c.length;j++){
		
				if(c[i]==c[j]){
					count++;
				}
			
			}
			System.out.println(+c[i]+ "="+count);
			
		}

	}
	
}

public class ArrayFeqCountApp{
	
	public static void main(String x[]){
	
		//here create the array with 6 six size and store only value in it using scanner
		//create the object of ArrayFeqCount
		//call the setIntArray function
		//call the countFeqCount() and write the manual logics
		
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("Enter the element in array");
		for(int i = 0;i < arr.length;i++) {
			
			arr[i] = sc.nextInt();
		
		}
		ArrayFeqCount AFC = new ArrayFeqCount();
		AFC.setIntArray(arr);
		AFC.countFeqCount();
		
	}
	
}