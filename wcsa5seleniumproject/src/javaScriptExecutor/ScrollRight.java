package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		//To perform Scrolling Operations
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//TO ScrollLeft
		jse.executeScript("window.scrollBy(5000,0)");


	}

}
