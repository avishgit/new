package learnSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG5 {
	
	
	@Test
	public void login() 
	{
		Assert.assertFalse(5>3);
		System.out.println("Login is successful");
	}
	
@Test(dependsOnMethods = "login")
public void payment() 
{
	System.out.println("Payment is done");


}
	
	
}
