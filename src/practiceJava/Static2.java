package practiceJava;

public class Static2 {
	int rollNo;
	String name;
	String college;         //global var

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Static2 student1=new Static2();   //Object creation of Static2 class+Global var will get memory
		
		student1.rollNo=1;
		student1.name="Avish";
		Static2 student2=new Static2();
		
		student2.name="xyz";
		System.out.println(student1.rollNo);       //   0
		System.out.println(student1.name);         //     null
		System.out.println(student1.college);      //     null
		
		System.out.println(student2.rollNo);       //   0
		System.out.println(student2.name);         //     null
		System.out.println(student2.college);
		
	//	100 Student-100 Object
		
		
		
	}

}
