package learnSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\New_Downloads\\Selenium_31_10_2022\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		//Object of chromeDriver  class we stored in WebDriver Interface
	  driver.navigate().to("https://www.facebook.com/");  //to launch the url in application
		Thread.sleep(3000);     //it will wait for 3 seconds
		driver.manage().window().maximize();  //maximize the window or browser
		Thread.sleep(3000);
		//sendKeys method we are doing with java script
		JavascriptExecutor js=(JavascriptExecutor) driver; //we have change the case of driver from webdriver to 
		//javascriptexicutor
		js.executeScript("document.getElementById('email').value='abcdef@gmail.com'");
		
		js.executeScript("window.scrollBy(0,500)"); //scroll down
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)");  //scroll up
		
		
		
	}

}
