package learnSelenium;

import org.testng.annotations.Test;

public class TestNG4 {

	
	//dev is working on registration feature -all testcase will fail 
	//which are related to reg so temp we disbale
	
	@Test(invocationCount = 2,priority = 2,enabled = true) 
	public void login() 
	{
	System.out.println("This is testcase a");	
	}
	@Test(enabled = true)  //one way to do industry used mostly
	public void reg()     //0 priority
	{	
	System.out.println("This is testcase b");	
	}
	@Test(invocationCount = 3)   //it will run same testcase 3 times
	public void reg1()           //By default priority is zero
	{	
	System.out.println("This is testcase c");	
	}
	@Test(invocationCount = 3,priority = 1,enabled = true) 
	public void d() 
	{
	System.out.println("This is testcase d");	
	}
	//dddaaccc    ---->cda    ---bcda
	
	
}
