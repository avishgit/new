
public class CheckedException {

	public static void main(String[] args) throws InterruptedException {//Using Throws 
	
		Thread.sleep(6000);  //checked Exception  //It is showing at compile time
		
		
		System.out.println("I am waiting for 6 seconds");
		
	}
	
	public void test() throws InterruptedException {
		
		Thread.sleep(3000);
	}
	
	
}
