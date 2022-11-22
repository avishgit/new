package practiceJava;

public class Throw1 {
	
	
	public static void ageCheck(int age) 
	{
		if(age<18) 
		{
		throw new NullPointerException("Not allowed for voting");	
		}
		else 
		{
			
			System.out.println("You are allowed to vote");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		ageCheck(10);
	}

}
