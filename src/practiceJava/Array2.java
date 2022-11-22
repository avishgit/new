package practiceJava;

public class Array2 {
	public static void main(String[] args) {
		int arra[]= {1,2,3};
		int[] arr= {1,2,3};  //Already array has the values
		int[] arr1=new int[5];   //Declared array with size
		arr1[0]=1;
		arr1[1]=1;	
		int[][] arr2= {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
		
		int rows=15 ; //Size of array
		
		System.out.println("No of rows:-" +rows);
		
		int columns=arr2[0].length;
		System.out.println("No of columns:-" +columns);
		
		
		for (int i = 0; i < 5; i++) {   //i is controlling the rows
			for(int j=0;j<9;j++)     //j is controlling the columns
			{
				System.out.print("*");   //Printing the 2-D array
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}
	
	// H.W
	// checked exception and unchecked read all question from the app.
	//Create a 2-d array with 5 columns and 10 rows and print it.
	//all keyword try,catch,throw,throws,finally   read defination from app
	
	
	
	
	
	

}
