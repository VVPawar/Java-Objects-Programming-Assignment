//1). WAP to create the class name as Circle with a following methods 
import java.util.*;

class Circle
{
 float radius,Area;
 void setRadius(float radius)//accept the radius 
 {
	 this.radius=radius;
 }
 void showArea()
 {
	 System.out.println("Area of Circle "+(3.14*radius*radius));//write here calculation logics of circle area and display it
 }
}
public class AreaApp
{
 public static void main(String x[])
 {
		//create here object of scanner and accept the radius as input 
		Scanner sc =new Scanner(System.in);
		float radius = sc.nextFloat();
		//create the object of area and call setRadius and pass radius input as parameter
		Circle c= new Circle();
		c.setRadius(radius);
		//call showArea() for display the display the area
		c.showArea();
 }
}
