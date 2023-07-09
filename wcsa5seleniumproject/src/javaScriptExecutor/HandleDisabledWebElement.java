package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the webapplication
		driver.get("file:///C:/Users/HP/Desktop/WCSA5/WebElement/Disabled.html");
		//identify webElement
		driver.findElement(By.id("i1")).sendKeys("admin");
		//driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		
		//To handle Disabled WebElement
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('i2').value='manager'");

	}

}
