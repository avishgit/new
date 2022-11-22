package practiceJava;

import java.util.Scanner;     //Import Statement Address of pre-defined class
 
public class UserInput {
	
	public static void main(String[] args) {
		int a;                   //Local
		float b;                 //Primitive
		String c;                 // non primitive 
		
		
		Scanner sc=new Scanner(System.in);    //Scanner is pre-define Class 
		
		System.out.println("Enter the String");  //Java.Lang has special permission
		c=sc.nextLine();                        //Taking String input from console 
		System.out.println("Enter the Integer Number");
		a=sc.nextInt();                          //Taking Integer input from console 
		System.out.println("Enter the Float number");
		b=sc.nextFloat();                          //Taking Float input from console 
		
		System.out.println("Entered String is:-->"+c);
		System.out.println("Entered Integer Number is:-->"+a);
		System.out.println("Entered Float Number is:-->"+b);
		
		
		
		
		
		
		
	}
	
	
	

}
