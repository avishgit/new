package learnSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileLearn {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	//	
		
		File file=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Online_Java_Selenium_Batch_Sep\\testdata.properties");
		//There is a file at that location
		FileInputStream fis=new FileInputStream(file);
		//We want read data from that file
		Properties pro=new Properties();  //Key value pair
		//We want to use property file key value
		pro.load(fis);
		//Link between property file and file input stream 
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\New_Downloads\\Selenium_31_10_2022\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		//Object of chromeDriver  class we stored in WebDriver Interface
        driver.navigate().to(pro.getProperty("URL"));  //URL from property file
		Thread.sleep(3000);     //it will wait for 3 seconds
		driver.manage().window().maximize();  //maximize the window or browser
		Thread.sleep(3000);
		String title=driver.getTitle();   //Fetch the title------>String
		Thread.sleep(3000);
		System.out.println(title);
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();  //Fetch the current url---->String
		System.out.println(url);
		WebElement email = driver.findElement(By.xpath(pro.getProperty("EmailXpath"))); //Return type is webelement
		email.sendKeys(pro.getProperty("EmailId")); //sending input keys to email textbox
		Thread.sleep(5000);
		WebElement pass = 
				driver.findElement(By.xpath(pro.getProperty("PasswordXpath"))); //findElement is find single webElement
		pass.sendKeys(pro.getProperty("Password"));	
		Thread.sleep(5000);
		WebElement loginButton = driver.findElement(By.xpath(pro.getProperty("Login")));
		loginButton.click();      //to click on single webElelemnt 
		Thread.sleep(5000);       //it will wait for given seconds	
	}
}
