package practiceJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		
		ArrayList   list=new ArrayList();     //Normal  //Declare a arrayList
		list.add("Mango");   //First Element is added to list
		list.add("Apple"); 
		list.add("Grapes"); 
		list.add("Orange"); 
		list.add("Mango");   //First Element is added to list
		list.add("Grapes"); 
		list.add(new String("Grapes"));    //AutoBoxing in java
		list.add(0);
		list.add(20.00);
		list.add(true);
		list.add(false);
		list.add(new Integer(25));
	
		
	//	System.out.println(list);
 //		System.out.println(list.size());
	
	  for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i));
	  
	 }           //ctrl+shift+?       //To print a list 
	 
	
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) 
		{
			
			System.out.println(itr.next());
		}
	
	
	
	
	
		
		
	
	}

}
