package learnSelenium;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG9 {
	@Parameters({"myName","YourName"})
	@Test(groups = {"Regression"})
	public void login(String myName,String YourName) 
	{
		System.out.println("my name is:----> "+myName);
		System.out.println("your name is:----> "+YourName);
	System.out.println("This is testcase a");	
	}
	
}
