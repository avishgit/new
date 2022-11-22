package practiceJava;

public abstract class  AbstractClass1 {       //Identifier  //By adding a abstract keyword before class keyword

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public AbstractClass1() {    //Constructor of abstract class 1
		super();             //We can not create a object only
		System.out.println("I am constructor inside the Abstractclass1");
		// TODO Auto-generated constructor stub
	}

public void aMethod()           //Non abstract method
{
	
System.out.println("I am a non abstract method in abstractclass1");
}
	
  abstract void break1() ;    //Abstract method without body only functionality is there


	
}
