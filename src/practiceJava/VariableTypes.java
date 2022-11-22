package practiceJava;

public class VariableTypes {
 int global=100;    //global variable
static int staticGlobal=300;    //static variable
	//when we learn about object of a class4
//datatype varname=value;
	public static void main(String[] args) {
//	static int local=200;       //local variable can not be static
	// static int w=600;	//we can not create inside the methods	
//	System.out.println(local); //Local variable we can access inside same method
//	System.out.println(global);//non static global variable 
	System.out.println(staticGlobal);//can not access in static method
	
	}
	
	public  void test() 
	{
	 
	//System.out.println(local); //local var of another method can not be accessed in 
		System.out.println(global);//different method
		System.out.println(staticGlobal);
		
	}
	
	public static void testMethod() 
	{
		
		
	}
	
	
	
}
