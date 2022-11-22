package practiceJava;

public class Split {
	
//charAt---->It will return a char at specific location/Index
	
	
	public static void main(String[] args) {
		
		String name="testatestajava";
		String[] store = name.split("a");   //String array 0 index Reema    1 index Kalda
		
		for (int i = 0; i < store.length; i++) {
			System.out.println(store[i]);
		}
		
		//split:-It can use to breakdown the string based upon char provided
		
		
	}

}
