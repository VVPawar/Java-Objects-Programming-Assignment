//3).WAP to create the class name as PrintMatrix with a two methods void acceptTwoDArray(int x[][]) and showMatrix() sample code given below 

class PrintMatrix{
	
	int a[][];
	void acceptTwoDArray(int x[ ][ ]){

		//here we store the two dimensional array in instance variable declared as two d in class e.g a
		a=x;

	}
	void showMatrix(){
		
		//here we can display the matrix logics
	
	}

}

public class PrintMatrixApp{
	
	public static void main(String x[]){

		//here we need to declare the two dimensional array with a 3 x 3 and store all values in it using a Scanner class
		int[][] a = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 3;j++){
				System.out.printf("Enter the "+i+" : "+j);
				a[i][j] = sc.nextInt();
			}
		}
		//create the object of PrintMatrix class and call the acceptTwoDArray() function and pass two d matrix in it
		//call the showMatrix() function for display the matrix.

	}

}