package practiceJava;

import java.util.Scanner;

public class ArmstrongNumber 
{    public static void main(String args[])   
{       int n, sum = 0, temp, remainder, digits = 0;        
Scanner in = new Scanner(System.in);       
System.out.println("Input a number to check if it is an Armstrong number");        
n = in.nextInt();         temp = n;       
// Count number of digits       
while (temp != 0) {       //371  
	digits++;       //3-digit counted
	temp = temp/10;   //   temp=371/10=37   37/10=3 3/10=0
	}        
temp = n; //371      
while (temp != 0) {     
	remainder = temp%10;     //371%10= 1    //37%10=30+7  //3%10=3
	sum = sum + power(remainder, digits); //  =0+ 1^3+7^3+3^3=x
	temp = temp/10;       }    // 371 -->temp=371/10=37----> 37/10=3
if (n == sum)       
	System.out.println(n + " is an Armstrong number.");    
else          System.out.println(n + " is not an Armstrong number.");   
}     
static int power(int n, int r) {     
	int c, p = 1;      
	for (c = 1; c <= r; c++)         
		p = p*n;      
	return p;   
}
}
