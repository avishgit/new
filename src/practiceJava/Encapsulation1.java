package practiceJava;

public class Encapsulation1 {
	int a;
	String b;
	public int getA() {           //right click>source>genrate getter and setter>select the variables>finish
		return a;
	}
	public void setA(int a) {
		this.a = a;           //This is used to point global variable
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
public static void main(String[] args) {
	Encapsulation1 e=new Encapsulation1();
	e.setA(100);                        //setting the value with help of set method
	int temp=e.getA();                  //getting the value with help of get method
	System.out.println(temp);
	
	
}
	
	
	
	
	
	
}
