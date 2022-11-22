package practiceJava;

public class Poly1 {
	
	public static void main(String[] args) {
		
		sum(4, 6);
		sum(2, 3,10);
		sum(2, 3,"I am using compiletime poly");
	}
public static void sum(int a, int b)         //2
{
	    System.out.println(a+b);                             //method overloading  //compile time polymorphism
}
public static void sum(int a,int b,int c)    //No of parameters are different  //3
{
	System.out.println(a+b+c);
}

public static void sum(int a,int b,String c)  //datatype is different
{
System.out.println(c+" "+(a+b));	
}
	
}
