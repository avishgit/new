package learnSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\New_Downloads\\Selenium_31_10_2022\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		//Object of chromeDriver  class we stored in WebDriver Interface
	  driver.navigate().to("https://demoqa.com/browser-windows");  //to launch the url in application
		Thread.sleep(3000);     //it will wait for 3 seconds
		driver.manage().window().maximize();  //maximize the window or browser
		Thread.sleep(3000);
		System.out.println("Title of old window open:---->"+driver.getTitle());
driver.findElement(By.xpath("//button[@id='windowButton']")).click();
//Store address of main window
String mainWindow = driver.getWindowHandle();
//All the windows
Set<String> allWindow = driver.getWindowHandles();   //total two address  --->1---->main 2--->new open
System.out.println("How many windows are open currently:--->"+allWindow.size());
//To navigate to newly open window
for (String window : allWindow) {  //2 value -one is mainwindow
if(window.equals(mainWindow)) {	
}
else {
	driver.switchTo().window(window); //To switch to another window.
}
}
System.out.println("Title of new window open--->"+driver.getTitle());
driver.switchTo().window(mainWindow);
System.out.println("Again switch to old window:---->"+driver.getTitle());

driver.quit();  //all the window open will be closed
	}

	
	
	
	
	
}
