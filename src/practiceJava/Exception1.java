package practiceJava;   //Identifier

public class Exception1 {    //keyword //access modifier  // Identifier
	
	public static void main(String[] args) { //keyword //Return type  //argument of string array
		CheckedException obj=new CheckedException();
		
		try {
			obj.test();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
		int a=3/0;     //terminated when the exception is occur
		int[] b=new int[3];
		System.out.println(b[4]);         
		}
		catch (ArithmeticException e) {   //We need to have the sequence in case of multiple catch blocks
			System.out.println("Catch block 1");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("I am inside array index out of bound");
		}
		catch (Exception e) {         //Parent class Exception usually comes at last
			System.out.println("Catch Block 2");
		System.out.println("I am inside the catch block because a exception is throw by try block");	
		}
		
		
		
		
		
		//Arithmetic Exception
		//Array index out of bound
		//Run time exception
		
		System.out.println("test");
		
		//try  //catch
		
	}

}
