package practiceJava;

public class Finally1 {
	
	public static void main(String[] args) {
	
	try {
		int a=5/0;  //code which can throw the exception
	}
	
	finally {       //To execution the code if exception occur or not 
		
		System.out.println("Execute when exception is occure or not");
	}
		
		
		
	}

}
