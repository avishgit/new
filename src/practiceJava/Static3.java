package practiceJava;

public class Static3 {
 int rollNo;
 String name;
 static String college="IIT Bombay";      //Something is common to each object
		
	/*
	 * Static3(int r,String s) //Special method with classname Constructor {
	 * rollNo=r; //To provide the value to the global variables name=s;
	 * //Constructor will be called automatically when object is created }
	 */
 
 public Static3(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}




	public Static3(String name) {
		super();
		this.name = name;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Static3 student1=new Static3(1, "Avish");  //we are providing value to global var when creating the object
	}

public void studentData() 
{
	System.out.println("rollNo is :-->"+rollNo);      
	System.out.println("Name is :-->"+name);        
	System.out.println("College is :-->"+college); 
}
	
}
