//6. create the class name as ConvertToUpper with a following methods
import java.util.*;

class ConvertToUpper{
 
	char[] c = new char[4];
	void setCharArray(char ch[]){
		
		//here accept the character array and store in instance variable in character array
		for(int i=0;i<c.length;i++){
			c[i] = ch[i];
		}
	}
	
	void convertToUpperCase(){

		//here we need to write the manual logics for converting lower case array
		//to upper case
		for(int i=0;i<c.length;i++){
			if(c[i] >= 'a' && c[i] <= 'z'){
				c[i]=(char)((int)(c[i]-32));
				System.out.printf(""+c[i]);
			}
		}
		
	}

}

public class ConvertToUpperApp{
 
	public static void main(String x[]){

		//here declare the fix array with a some character e.g char ch[]=new char[]={"good"};
		//here create the object of ConvertToUpper class 
		//call setCharArray() function and pass ch array in setCharArray() function
		//call convertToUpperCase() function and see the result
		
		char[] ch = "good".toCharArray();
		ConvertToUpper c = new ConvertToUpper();
		c.setCharArray(ch);
		c.convertToUpperCase();
		
	}
	
}