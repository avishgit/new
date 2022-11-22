package practiceJava;

import java.util.Iterator;

public class Array3 {
	
	
	public static void main(String[] args) {
		
		int[] arr1=new int[6];   //size 6 //There is no way to increase size based upon req
		int[][] arr=new int[4][3];
		int rows=arr.length;
	int columns=arr[0].length;	
	int count=0;
		for (int i = 0; i < rows; i++) {   //To assign the values in array
			for (int j = 0; j < columns; j++) {
				     //local variable
				arr[i][j]=count;
				count++;
		}}
			
			for (int j = 0; j < rows; j++) {   //To print the value in arrays
				for (int j2 = 0; j2 < columns; j2++) {
		
					System.out.print(arr[j][j2]+"   ");
					
				}
				System.out.println();
			}
		
		
		
		
		
		
		
		
		
		
		
	}

}
