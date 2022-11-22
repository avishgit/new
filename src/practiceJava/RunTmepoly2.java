package practiceJava;

public class RunTmepoly2 extends RunTimePoly1{
	int a=100;
	public static void main(String[] args) {
	
		RunTimePoly1 obj=	new RunTmepoly2(); //Child obj i am store in parent class ref
		obj.speedLimit();
	}
	public void speedLimit()   //RunTime poly Morphism //Same method Name with parent-child relationship
	{
		
		System.out.println("150");
		
	}
	
	void test() 
	{
		
		
		
	}
	
	
	
	
}
