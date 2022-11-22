package practiceJava;

public class Interface2 implements Interface1{  //class will implement the interface
                                             //Once you implement it you need give 
	                                         // defination to methods of Interface
	

	@Override
	public void aMethod() {
		// TODO Auto-generated method stub
		System.out.println("I am declared inside Interface1 but i get the defination inside class Interface2");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("I am declared inside Interface1 but i get the defination inside class Interface2");
		
	}
	
}
