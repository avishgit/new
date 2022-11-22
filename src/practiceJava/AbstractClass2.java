package practiceJava;

public class AbstractClass2 extends AbstractClass1{
	
	@Override
	void break1() {               //Method overriding
		// TODO Auto-generated method stub
		System.out.println("I am pressing the break from Abstractclass2");
	}

	public static void main(String[] args) {
		
		AbstractClass2 obj1=new AbstractClass2();   //This is non abstract class
			obj1.break1();
		  obj1.aMethod();
		
	}
		}
