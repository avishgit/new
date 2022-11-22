package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"E:\\New_Downloads\\Selenium_31_10_2022\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();   
	//Object of chromeDriver  class we stored in WebDriver Interface
  driver.navigate().to("https://www.facebook.com/");  //to launch the url in application
	Thread.sleep(3000);     //it will wait for 3 seconds
	driver.manage().window().maximize();  //maximize the window or browser
	Thread.sleep(3000);

	WebElement createButton=driver.findElement(By.xpath("//a[text()='Create New Account']"));
	createButton.click(); //clicking on create new account button
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='1']")).click();  //clicking on Radio button Gender
	Thread.sleep(3000);
	driver.quit();
	//a[text()='Create New Account']
	
	//input[@value='1']
}
}
