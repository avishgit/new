package practiceJava;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=15;
		int weight=45;
		
		if(age>18) {     //Nested if condition
			
			if(weight>50) 
			{
				System.out.println("You are eligible for vote");
			}
			else 
			{
				System.out.println("You are not eligible for vote");
				
			}
			
		}
		else {
			
			System.out.println("Your age is less than 18");
			
		}
		
		
		

	}

}
