package practiceJava;    

public class VariableRangeDetails {

	static boolean check; //Declaration of variable
	static byte var1=-128;  //out of range of byte
	static short var2=32767;  //out of range of short
	static long var3=814868146814L;
	static float var4=30.333333323333333333333333f;  //upto 7 decimals
	static double var5=30.333333323333333333333333; //upto 16 decimals
	static char var6='a';
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(check); // By default value is false
System.out.println(var1);  //Byte default value is zero
System.out.println(var4);
System.out.println(var5);
System.out.println(var6);

//-128 to 127  power=bits -1   -2^power  and 2^power-1





	}

}



