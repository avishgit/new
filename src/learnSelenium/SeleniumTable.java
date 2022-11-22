package learnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTable {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\New_Downloads\\Selenium_31_10_2022\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();   
	//Object of chromeDriver  class we stored in WebDriver Interface
  driver.navigate().to("https://money.rediff.com/gainers");  //to launch the url in application
	Thread.sleep(3000);     //it will wait for 3 seconds
	driver.manage().window().maximize();  //maximize the window or browser
	Thread.sleep(3000);
	List<WebElement> companyName = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
	//Multiple result from xpath thats why we have used findElelemnts.--->List
	System.out.println(companyName.size());
	List<WebElement> currentPrice 
	= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	//List of webElement for current price
	
	//
	String expectedCompany="Prime Fresh";
	for (int i = 0; i < companyName.size(); i++) {
		
		String actualCompanyName=companyName.get(i).getText(); //Pointing to single webelement at a time
		
		if(actualCompanyName.equals(expectedCompany)) 
		{
			
			System.out.println("My company Name is:--->"+actualCompanyName
			+"   "+"Current Price is:--->"+currentPrice.get(i).getText()); //gettext is a method inside webElement
			
		}
		
	}
	
	
	
	

}}
