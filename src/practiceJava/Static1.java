package practiceJava;

public class Static1 {

	int rollNo;
	String Name;                             //Global var+Non primitive+When obj is created
	static String College="IIT Bombay";     //Static var+Class loading
	
   
	public static void aMethod()         //Static method
	{
		static int x=100;                //static var is not allowed
		
		
	}
	public void bMethod() 
	{
		int a=100;                   //Local var +primitive+Numeric
		
	}
	
	
	

}
