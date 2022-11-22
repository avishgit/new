package practiceJava;

import java.util.Iterator;

public class ForLoop2 {
	
	public static void main(String[] args) {
	
		
		int[] a= {2,5,10,20,25};  //int type array   a.length size=5-1=4(lastIndex)
		       //i=0         // i<5   i++
		System.out.println("Output of for Loop:---->");
		for (int i = 0; i < a.length; i++) {    //forloop   0-1-2-3-4-5-6-7  //intial value=where to start 
			                                      //i<5     0-1-2-3-4  condition-->where to stop
			                                      //increment or decrement to decide go forward/reverse
			System.out.println(a[i]);
		}
		
		System.out.println("Output of forEach Loop:---->");
		for (int i : a) {
		
			System.out.println(i);
		}   //i=4
		System.out.println("Output of reverse for loop");
	     for(int i=a.length-1;i>=0;i--)       // intial value= 4-->25
	     {                                   // i>=0   4-3-2-1-0
	    	 
	    	 System.out.println(a[i]);
	     }
		
		
		
	}

}
