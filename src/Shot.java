import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class Shot {

	WebDriver driver;
	@Parameters("myName")
	@org.testng.annotations.Test
	public void data(String myName) throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\New_Downloads\\Selenium_31_10_2022\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();   
		//Object of chromeDriver  class we stored in WebDriver Interface
      driver.navigate().to("https://www.facebook.com/");  //to launch the url in application
		Thread.sleep(3000);     //it will wait for 3 seconds
		driver.manage().window().maximize();  //maximize the window or browser
		Assert.assertFalse(true);
	
	}
	
	@AfterMethod
	public void capture(ITestResult result) throws IOException 
	{
		if(result.getStatus()==ITestResult.FAILURE) {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File img=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(img, new File("./screenshot"+result.getName()+".png"));
	}}
	
	
	
	
	
	
	
	
	
	
}
