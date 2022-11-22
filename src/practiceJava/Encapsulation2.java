package practiceJava;

public class Encapsulation2 {
	
	private int age;

	public static void main(String[] args) {	
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {  //Setter method with condition 
		if(age<18) 
		{
			System.out.println("Enter a valid age which is more than 18");
			
		}else {
		
		this.age = age;
	}
		}

}
