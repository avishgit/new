package practiceJava;

public class Interface5 extends Interface2 implements Interface3,Interface4{

	@Override
	public void cMethod() {
		// TODO Auto-generated method stub
		System.out.println("I am coming from Interface4");
	}

	@Override
	public void bMethod() {
		// TODO Auto-generated method stub
		System.out.println("I am coming from Interface3");
	}
	public static void main(String[] args) {
	//	Interface3 obj=new Interface3(); //we can not create the object of Interface and abstract class
		Interface5 obj=new Interface5();
		obj.aMethod();
		obj.bMethod();
		
	}
	

}
