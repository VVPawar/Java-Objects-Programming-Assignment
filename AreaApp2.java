//2.Create the Class Name as Rectangle with a following methods and write its logics.
import java.util.*;

class Rectangle
{
	int len,wid;
	void setLengthWidth(int len,int wid)//accept the radius 
	{
		this.len=len;
		this.wid=wid;
	}
	void showArea()
	{
		//write here calculation logics of circle area and display it
		System.out.println("Area of Rectangle "+(len*wid));
	}
}
public class AreaApp2
{ 
public static void main(String x[])
 { 
		//create here object of scanner and accept the radius as input 
		Scanner sc =new Scanner(System.in);
		int len = sc.nextInt();
		int wid = sc.nextInt();
		//create here object of scanner and accept the length and width as input
		Rectangle r = new Rectangle();
		r.setLengthWidth(len,wid);
		//create the object of Rectangle and call setLengthWidth and pass radius input as parameter
		r.showArea();
		//call showArea() for display the display the area
 }
}

