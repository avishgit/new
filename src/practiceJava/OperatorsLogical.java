package practiceJava;

public class OperatorsLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=10;
    int j=7;
		
     boolean op1=false;
     boolean op2=false;
		 //false       //Bitwise operator 
		if(i<j && i++>j)    //only one condition is checked if first condition is false in case AND Bitwise operator
		{
			System.out.println(i);
		System.out.println("Inside if block");	
		}
		else 
		{
			System.out.println(i);
		System.out.println("Inside else block");	//This code will be executed
			
		}
		
		
		
	}

}
