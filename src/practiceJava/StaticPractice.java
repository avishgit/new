package practiceJava;

public class StaticPractice {
	int rollNo;
	String name;
	String college;
	
	static int a=10;        // Static variable  //Class Loading
	int b=0;               //Global variable   //Obj is created for StaticPratice
	public static void main(String[] args) {
		//Keyword-->Every keyword has some special meaning 
		StaticPractice student1=new StaticPractice();
		student1.rollNo=1;
		student1.name="Avish";
		student1.college="IIT Bombay";
		
		StaticPractice student2=new StaticPractice();
		student2.rollNo=2;
		student2.name="Payal";
		student2.college="IIT Bombay";
		
		StaticPractice student3=new StaticPractice();
		student3.rollNo=3;
		student3.name="Nikhil";
		student3.college="IIT Bombay";		
		
		sum(500,200);
		printStudentData(student1);
		printStudentData(student2);
		printStudentData(student3);
     		
	}
	
	public static void printStudentData(StaticPractice student)           //Non Static Method
	{
		System.out.println("Student RollNo is="+student.rollNo);
		System.out.println("Student RollNo is="+student.name);
		System.out.println("Student RollNo is="+student.college);	
	}
	public static void sum(int a,int b)           //Static method
	{                                             // int a -first input to the method
		System.out.println(a+b);                  //int b-second input to the method
	}                                             //a+b output of the method
}
