package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\New_Downloads\\Selenium_31_10_2022\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		//Object of chromeDriver  class we stored in WebDriver Interface
	  driver.navigate().to("https://demoqa.com/droppable/");  //to launch the url in application
		Thread.sleep(3000);     //it will wait for 3 seconds
		driver.manage().window().maximize();  //maximize the window or browser
		Thread.sleep(3000);
	WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']")); //drag
	WebElement drop=driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		//drop
		Actions act=new Actions(driver); //Actions class
		act.dragAndDrop(drag, drop).build().perform(); //draganddrop method
	    String insideBox=driver.findElement(By.xpath("//p[normalize-space()='Dropped!']")).getText();//getting text
		  System.out.println(insideBox);//printing text
		  
		  if(insideBox.equals("Dropped!")) //comparing text
		  {
			  System.out.println("TC is passed");   //pass is matched  
		  }
		  else {
			  
			  System.out.println("TC is failed");
		  }
		
		
		driver.close();  //closing the browser.
	}
	
	
}
