package learnSelenium;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\New_Downloads\\Selenium_31_10_2022\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		//Object of chromeDriver  class we stored in WebDriver Interface
	  driver.navigate().to("https://www.flipkart.com/");  //to launch the url in application
		Thread.sleep(3000);     //it will wait for 3 seconds
		driver.manage().window().maximize();  //maximize the window or browser
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); //cross button in flipkart
		Thread.sleep(3000);
	    WebElement elc=driver.findElement(By.xpath("//div[contains(text(),'Electronics')]")); //xpath of elc
	    Actions ac=new Actions(driver);    //Actions class for mouse action
	    ac.moveToElement(elc).build().perform(); //added move to element and build and perform method.
	    Thread.sleep(3000);
	  //  ac.contextClick().build().perform();  //right click
	    WebElement mobile=driver.findElement(By.xpath("//img[@alt='Mobiles']"));
	    ac.contextClick(mobile).build().perform();
	    
	    
		/*
		 * WebElement serach= driver.findElement(By.
		 * xpath("//input[@placeholder='Search for products, brands and more']"));
		 * serach.sendKeys("iphone"); ac.sendKeys(Keys.ENTER).build().perform();
		 * //keyboard action press enter from my keyboard
		 */ 
	  // closing the driver.
		
		
		
		
	  //div[@id='draggable']
	    
	  //div[@id='simpleDropContainer']//div[@id='droppable']
		
	}
	

}
