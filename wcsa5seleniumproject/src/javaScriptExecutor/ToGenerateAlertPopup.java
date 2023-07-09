package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateAlertPopup {

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
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//To generate alert pop up
		js.executeScript("alert('Hello There!!');");
		Thread.sleep(2000);
		//To handle pop up
		driver.switchTo().alert().accept();
		
		//To handle Disabled WebElement
		js.executeScript("document.getElementById('i2').value='manager'");

	}

}
