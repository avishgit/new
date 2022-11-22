
package practiceJava;

public class Static4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Static3 s1=new Static3(1, "Isha");    //Creation of object of another class
		Static3 s2=new Static3(2, "Reema");
		Static3 s3=new Static3(3, "Payal");
		Static3 s4=new Static3(4, "DeepShikha");
		Static3 s5=new Static3("xyz");
		
		
		s4.rollNo=9;                   //Specific to object
		Static3.college="IIT Delhi";      //common to each object
		                                 //college is static and it is common to every object
		s1.studentData();               //Data Print for each student using another class method
		s2.studentData();                //Static variable are used for memory management
		s3.studentData();
		s4.studentData();
		
		
		
		
		
		
		
		
	}

}


