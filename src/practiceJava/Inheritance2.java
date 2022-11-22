package practiceJava;

public class Inheritance2 extends Inheritance1 {     //extends keyword after parent class Name
int b=25;                                          //Parent -Inhertance1, Child-Inheritance2
public static void main(String[] args) {

	Inheritance2 obj1=new Inheritance2();
	
	obj1.read();
}
public void read() 
{
System.out.println(a);   //we are accessing variable from parent class Inhertance1
write();	     //we are accessing property of parent Inheritance1 +method property
System.out.println("I am reading from Inheritance2");
}

	
}
