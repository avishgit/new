package practiceJava;

public class Variable1 {

	static String val1="Hello Java"; //Intialization 
	                           //String class is predefined in java.
	                           //For String we need to provide value in ""
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String val="Hello Selenium8247846";   //Assignment
		System.out.println(val);  //Hello Java---->Hello Selenium
		System.out.println("val"); // val
		val1="MST";
		// length of String
		int lengthOfTheString=val1.length();//length is method inside String class 
		System.out.println(lengthOfTheString);
		System.out.println(val+" "+val1);
		System.out.println("Length of my String is:-"+lengthOfTheString);
		
	}

}
