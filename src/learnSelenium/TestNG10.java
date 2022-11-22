package learnSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG10 {
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException 
	{System.out.println("Inside before");
		System.setProperty("webdriver.chrome.driver", 
				"E:\\New_Downloads\\Selenium_31_10_2022\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();   
		//Object of chromeDriver  class we stored in WebDriver Interface
      driver.navigate().to("https://www.facebook.com/");  //to launch the url in application
		Thread.sleep(3000);     //it will wait for 3 seconds
		driver.manage().window().maximize();  //maximize the window or browser
	}
	@Test   //dataprovider name + parameter to catch the data
	public void login() throws InterruptedException, IOException 
	{System.out.println("Inside Test");
//	System.out.println(name);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']")); //Return type is webelement
		email.clear();
		email.sendKeys("username"); //sending input keys to email textbox
		WebElement pass = 
				driver.findElement(By.xpath("//input[@id='pass']")); //findElement is find single webElement
		pass.clear();
		pass.sendKeys("password");	
		Thread.sleep(5000);
		Assert.assertEquals("QA", "tester");
			
		
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException 
	{
		
		
		if(result.getStatus()==result.FAILURE) {
		TakesScreenshot ts=(TakesScreenshot) driver;  //Add cast in java
		File img = ts.getScreenshotAs(OutputType.FILE);  //taken the screenshot and type is file
		FileUtils.
		copyFile(img,new File("C:\\Users\\LENOVO\\eclipse-workspace\\Online_Java_Selenium_Batch_Sep\\"+"testcase"+".png"));
		}
		
		
		System.out.println("Inside After");
		driver.close();
	
	
	
	}
	
	
	
	
	
	

}

//H.W--->
//Facebook program we need to create again in testng annotation
//


