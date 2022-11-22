package learnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrpDown {

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
	
		
		 //One way to handle a dropdown in selenium WebElement bm =
		WebElement bm=  driver.findElement(By.xpath("//select[@id='month']")); //month dropdown
		  
		  Select month=new Select(bm); //select tag we used Select class
		  
		  month.selectByVisibleText("Mar"); //Method we used sbvt inside Select class
		  
		  Thread.sleep(3000); month.selectByIndex(10); //select by Index method from
		  //Select class 
		  Thread.sleep(3000); month.selectByValue("12"); //selectBy Value
		 // from Select class
		 
		  
		  
		  
		  
		  
		//Second Way to Handle same dropdown
      WebElement b = driver.findElement(By.xpath("//select[@id='month']")); //month dropdown
		
		Select months=new Select(b);  //select tag we used Select class
		
		/*
		 * List<WebElement> drpDwn = months.getOptions();//It will return list of
		 * webelement
		 * 
		 * for (int i = 0; i < drpDwn.size(); i++) { WebElement a =
		 * drpDwn.get(i);//start from Jan and end at Dec
		 * System.out.println(a.getText()); String drpDownValue=a.getText(); //Jan
		 * String to Dec String
		 * 
		 * if(drpDownValue.equals("Aug")) {
		 * 
		 * a.click();
		 * 
		 * }
		 * 
		 * 
		 * }
		 */	//3rd way to handle dropdown
	
		/*
		 * System.out.println(months.isMultiple()); //true if dropdown is
		 * multiple------>false in our case months.selectByIndex(0); //Jan
		 * Thread.sleep(3000); months.selectByValue("7"); //June Thread.sleep(3000);
		 * months.selectByVisibleText("Feb"); //Feb Thread.sleep(3000); String
		 * currentMonthSelected=months.getFirstSelectedOption().getText();
		 * System.out.println(currentMonthSelected); //Feb
		 */		
		//4th way to select value in dropDown
	//	b.sendKeys("Mar");
		
		//5th way to handle dropdown
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Apr");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
}
}