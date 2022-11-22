package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\New_Downloads\\Selenium_31_10_2022\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		//Object of chromeDriver  class we stored in WebDriver Interface
	  driver.navigate().to("https://demoqa.com/alerts");  //to launch the url in application
		Thread.sleep(3000);     //it will wait for 3 seconds
		driver.manage().window().maximize();  //maximize the window or browser
		Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	Thread.sleep(3000);
	
	     String textOnPopUp=driver.switchTo().alert().getText();
	System.out.println("text present on the pop up is ---->"+textOnPopUp);
	
	driver.switchTo().alert().accept(); //This is to click on ok
//	driver.switchTo().alert().Dismiss();  //This is to click on cancel
	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("My Name is Avish");
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	
	
	

	
	
	}
	
	

}
