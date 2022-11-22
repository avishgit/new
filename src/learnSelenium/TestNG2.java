package learnSelenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG2 {
	
	
	@Test(priority = 1)
	public void a() 
	{
		System.out.println("I am inside test a");
	}
	@DataProvider
	public Object[][] getData() 
	{
		
		return  new Object[][]{{"avish","test"},{"avishM","TestM"}};
		
		
	}
	
	@Test(priority = 5)
	public void b() 
	{
		System.out.println("I am inside test b");
	}
	@Test(priority = 10)
	public void c() 
	{
		System.out.println("I am inside test c");
	}
	@Test(priority = -20,dataProvider = "getData")
	public void d(String a,String b) 
	{
		System.out.println(a+b);
		System.out.println("I am inside test d");
		
	}
	
	
	
	

}
