package learnSelenium;

import org.testng.annotations.Test;

public class TestNG8 {
	@Test(groups = {"Regression"})
	public void login() 
	{
	System.out.println("This is testcase a");	
	}
	@Test(groups = {"Smoke"})
	public void reg()    
	{	
	System.out.println("This is testcase b");	
	}
	@Test(groups = {"Regression","Smoke"})
	public void forgot()           
	{	
	System.out.println("This is testcase c");	
	}
	@Test(groups = {"Regression","Smoke","Sanity"})
	public void negativelogin() 
	{
	System.out.println("This is testcase d");	
	}
	
	
	
}
