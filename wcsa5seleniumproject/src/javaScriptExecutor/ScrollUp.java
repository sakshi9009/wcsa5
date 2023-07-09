package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		//To Perform Scrolling Operations
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//To  ScrollDown
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1000)");
		
	    //To ScrollUp
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-1000)");

	}

}
