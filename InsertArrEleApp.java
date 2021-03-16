//7.WAP to create the class name as InsertArrayEle with a following methods 
import java.util.*;

class InsertArrEle{ 
	
	int c[];
	
	void setIntArray(int ch[]){ 
 
		//here accept the integer array and store in instance variable in integer array
		c=ch;
 
	}
	
	void insertValueOnIndex(int index,int value){ 
	
		//here we need to write the manual logics for inserting value on specified index in arr
				

		
		for(int i = c.length - 1;i > index;i--)
		{
			
			c[i] = c[i - 1];
		
		}
		
		c[index] = value;
		System.out.printf("\n");
		for(int i = 0;i < c.length;i++) {
			
			System.out.printf(c[i]+"\t");
		
		}
	
	}
	
}

public class InsertArrEleApp{
	
	public static void main(String x[]){ 
 
		//here create the array with 6 six size and store only five value in it using scanner
		int a[]=new int[6];
		System.out.println("Enter the element in array");
		Scanner sc= new Scanner(System.in);
		for(int i = 0;i < a.length - 1;i++) {
			
			a[i] = sc.nextInt();
		
		}
		
		//create the object of InsertArrEle class
		//call the setIntArray function
		//call the insertValueOnIndex() and write the manual logics
		
		System.out.println("Enter the specified index : ");
		int index = sc.nextInt();
		
		System.out.println("Enter the value of insert : ");
		int value = sc.nextInt();
		InsertArrEle I = new InsertArrEle();
		I.setIntArray(a);
		I.insertValueOnIndex(index,value);
		
	}
}