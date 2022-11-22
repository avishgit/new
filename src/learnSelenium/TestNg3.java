package learnSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg3 {
	
	
	@Test
	public void e() 
	{
		Assert.assertEquals("QA", "QA");
		Assert.assertFalse(false);    //This will pass
	    Assert.assertTrue(true);   //This will pass
	    Assert.assertNotEquals("QA","QA"); //This will fail
	}
	

}
