package practiceJava;

public class AccessModifier {
	
	private void test() 
	{
		
	}
	 void test1()            //Default method
	{
		
		System.out.println("this is a default method");
	}
	 protected void test2() 
	 {
		 
		 System.out.println("I am inside the protected method");
		 
	 }
	 
	 public String sum(int a,int b,String s) 
	 {
		 System.out.println(s);
		return s;
		 
	 }
	 
	 public boolean vote(int age) 
	 {
		 if(age>18) 
		 {
			 return true;
			 
		 }
		 else {
		return false;
		 }
	 }
	 
	 
	
	public static void main(String[] args) {
		AccessModifier access=new AccessModifier();
		access.test();                    //this is same class you can acess private
		
		System.out.println(access.sum(10, 20,"I am printing the sum"));
	System.out.println(access.vote(19));
		
		
	}

}
