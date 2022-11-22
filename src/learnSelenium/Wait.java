package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.implementation.bytecode.Duplication;
import okio.Timeout;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"E:\\New_Downloads\\Selenium_31_10_2022\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		//Object of chromeDriver  class we stored in WebDriver Interface
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //Implicite wait
      driver.navigate().to("https://www.facebook.com/");  //to launch the url in application
		    //it will wait for 3 seconds
		driver.manage().window().maximize();  //maximize the window or browser
				
		WebDriverWait wt=new WebDriverWait(driver, 60); //Explicite wait
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email123']")); //Return type is webelement
		wt.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("MyFirstWebElement"); //sending input keys to email textbox
		
		email.clear();    //it will clear the text
		
		email.sendKeys("newData");
		
		WebElement pass = 
				driver.findElement(By.xpath("//input[@id='pass']")); //findElement is find single webElement
		pass.sendKeys("MySecondPass");	
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();      //to click on single webElelemnt 
		     //it will wait for given seconds
		String title2 = driver.getTitle();  //fetching new title
	
		driver.close(); 
		
		
		
		
		
		
		
		//To close the browser
		//Get method is used to open any url in any browser
		//Open the chrome
		//Launch the url 
		
		//input[@id='email']
		//input[@id='pass']
		
		
	}

}
