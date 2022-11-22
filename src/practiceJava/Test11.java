package practiceJava;      //keyword+packagename

public class Test11 {        //keyword  +classname+opening bracket of class
	
	// 1 argument
public static void main(String[] args) {//keywords + methodName +Meathod arguments
	printMultipleCity("Delhi","pune","Mumbai");
	printCity("Pune","India");          //                           
	System.out.println("Avish");        
	System.out.println("Payal");         
	System.out.println("Swati");       
	System.out.println("Isha");	  
	foodItem();   
	//calling food item method
	printCity("Chd","India");
	System.out.println("After food item method");
}
//0 arguments
public static void foodItem() {    //user define method 
	System.out.println("Tea");      //method signature +body    
	System.out.println("Rice");
	System.out.println("Curd");
}
//2 argument
public static void printCity(String city,String contry) {
	System.out.println(city);	
	System.out.println(contry);
}
public static void printMultipleCity(String city1,String city2,String city3) {
	System.out.println(city1);	
	System.out.println(city2);
	System.out.println(city3);
}








}





