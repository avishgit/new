package practiceJava;

public class Reverse {

	     // ------>reverse it
	public static void main(String[] args) {
		String  name="12345";
		Reverse obj=new Reverse();
		obj.reverse(name);
	
	}
public void reverse(String s) 
{

// System.out.println( s.charAt(5));	  //CharAt will return a char at given index
	
	
	for (int i = s.length()-1; i >=0; i--) {
		
		System.out.print(s.charAt(i));
		
		
		
	}

}
	


}
