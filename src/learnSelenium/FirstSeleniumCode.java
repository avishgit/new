package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"E:\\New_Downloads\\Selenium_31_10_2022\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		//Object of chromeDriver  class we stored in WebDriver Interface
      driver.navigate().to("https://www.facebook.com/");  //to launch the url in application
		Thread.sleep(3000);     //it will wait for 3 seconds
		driver.manage().window().maximize();  //maximize the window or browser
		Thread.sleep(3000);
		String title=driver.getTitle();   //Fetch the title------>String
		Thread.sleep(3000);
		System.out.println(title);
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();  //Fetch the current url---->String
		System.out.println(url);
	
//	old title --->//	Facebook – log in or sign up
//	New Title---->//	log in into Facebook

		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']")); //Return type is webelement
		email.sendKeys("MyFirstWebElement"); //sending input keys to email textbox
		Thread.sleep(5000);
		email.clear();    //it will clear the text
		Thread.sleep(3000);
		email.sendKeys("newData");
		
		WebElement pass = 
				driver.findElement(By.xpath("//input[@id='pass']")); //findElement is find single webElement
		pass.sendKeys("MySecondPass");	
		Thread.sleep(5000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();      //to click on single webElelemnt 
		Thread.sleep(5000);       //it will wait for given seconds
		String title2 = driver.getTitle();  //fetching new title
		if(title.equals(title2))     //comparing the titles
		{
			System.out.println("test case is failed");	 //if same then fail the testcase
		}
		else 
		{
			System.out.println("Test case is passed");
		}
		driver.close(); 
		
		
		
		
		
		
		
		//To close the browser
		//Get method is used to open any url in any browser
		//Open the chrome
		//Launch the url 
		
		//input[@id='email']
		//input[@id='pass']
		
		
	}

}
