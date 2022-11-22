package practiceJava;

public class UnaryOperator {
	
	
	
	
	public static void main(String[] args) {
		int i=1;
		int j=10;
		/*
		 * System.out.println(i++);// 1--->2 //1,2,3 ---> i++ i=i+1;
		 * System.out.println(i++);// 2---->3 System.out.println(i); //3
		 * System.out.println(j++); //10---->11 System.out.println(j); //11
		 * System.out.println(j--); // 11---->10 System.out.println(j); //10
		 * System.out.println(j++); //10--->11
		 */		
		
		
		int a = 10;
		int b = 10;

		System.out.println(a++);           //10--->11      
		System.out.println(a++ + ++a);     //11--->12   +12---->13
		System.out.println(b++ + ++b);     //10+12=22
		System.out.println(b++ + b++);    //12+13
		System.out.println(b);           //14
		
		
		// H.W   Increment Operator  same thing You need to do for Decrement

		
		
		
		/*
		 * System.out.println(++i); //2--->2 System.out.println(++i); //3---->3
		 * System.out.println(i); //3 System.out.println(++j); //11
		 * System.out.println(j); //11 System.out.println(--j); //10
		 * System.out.println(j); //10 System.out.println(++j); //11
		 */		
		
		
		
		
		
		
	}

}
