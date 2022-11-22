package practiceJava;

public class Student {
	int rollNo;               //Global Variable
	int marks;
	String studentName;

	public static void main(String[] args) {
     
		Student student1=new Student();   //Object of Student class.
		student1.rollNo=1;                   //Assignment of values
		student1.studentName="Reema";
		student1.marks=90;
		System.out.println(student1.studentName);  //Print value of student object
		Student student2=new Student();   //new is keyword(allocate memory for object)
		student2.rollNo=2;
		student2.studentName="Mrunal";
		student2.marks=80;
		
		System.out.println(student2.studentName);
		//H.W You need print all values and create more object and then try again
		
		
		
		
		
		
		
		
	}
	public void StudentResultDisplay() 
	{
		int a=0;
		System.out.println("Student is pass");
	}
	
	
	

}
