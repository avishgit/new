package practiceJava;

public class CompareOfString {
	
	public static void main(String[] args) {
		
	
	String str1="Hello";
	String str2="Hello";
	String str3=new String("Hello");
	String str4=new String("Hello");
	String str5="Hello";
	
	if(str1==str5)                //true  //== will compare the address
	{
	System.out.println("I am inside 1st if");	
		
	}
	if(str1.equals(str2))            //true  //equals compare the value
	{
		System.out.println("I am inside 2nd if")	;
		
	}
	if(str3==str4)                       //false
	{
		System.out.println("I am inside 3rd if");
		
	}

	if(str3.equals(str4))         //true
	{
		System.out.println("I am inside 4th if");
	}

	
	
	
	
	
	

}}
