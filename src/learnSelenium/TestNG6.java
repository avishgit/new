package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG6 {
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
	@Test(dataProvider = "getData")   //dataprovider name + parameter to catch the data
	public void login(String username,String password) throws InterruptedException 
	{System.out.println("Inside Test");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']")); //Return type is webelement
		email.clear();
		email.sendKeys(username); //sending input keys to email textbox
		WebElement pass = 
				driver.findElement(By.xpath("//input[@id='pass']")); //findElement is find single webElement
		pass.clear();
		pass.sendKeys(password);	
		Thread.sleep(5000);
		      //to click on single webElelemnt 
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();      //to click on single webElelemnt 
		
	}
	@AfterMethod
	public void tearDown() 
	{System.out.println("Inside After");
		driver.close();
	}
	@DataProvider         //dataprovider to single testcase multiple time with different data
	public Object[][] getData()
	{
	//	int[][] a= {{1,2,3},{3,4,6}};         //    1  2 3
		                                      //    3  4  6
		Object[][] data= {{"Test1","Pass1"},{"Test2","Pass2"},{"Avish","Pass3"}};
		return data;
	}
}

//H.W--->
//Facebook program we need to create again in testng annotation
//


