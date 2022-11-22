import java.math.BigInteger;
import java.util.Scanner;

public class Test {
	
	
   public static void main(String args[])  
   {     int n, c;    
   BigInteger inc = new BigInteger("1");       //1
   BigInteger fact = new BigInteger("1");      //1
   Scanner input = new Scanner(System.in);      
   System.out.println("Input an integer");    
   n = input.nextInt();                       //3
   for (c = 1; c <= n; c++) 
   {      .
	   fact = fact.multiply(inc);          //fact= 1*1=1--->fact=1*2=2----->fact=2*3=6
   inc = inc.add(BigInteger.ONE);          // inc=2---->3
   
   }   
   System.out.println(n + "! = " + fact);
   }

   
 //  4!=4*3*2*1
 //  6!=6*5*4*3*2*1
 //   3!=3*2*1  
}
