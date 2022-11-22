package practiceJava;

public class RangeOfVariables {
	int x=100;  //global variable  //Intialization
	int y =200;   //global var

	// int x=1000;   //Duplicate variablename are not allowed
	
	
	public static void main(String[] args) {
		int w=100;  //Intialization
		 w=2000; //Local variable duplicate is not allowed  //assignment
		System.out.println(w);  //2000 printed
		aMethod();  //calling the method
	}
	public static void aMethod() 
	{
		int x=1000;     //we can have same name variable inside method and global level
		System.out.println(x);//It always give preference to local variable in case of 
		//duplicate variable	
	}
	
	public void bMethod() 
	{
		
		y=10000;  //assignment of global variable-non static
		
	}
	
	

}
