package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60      ));
	    WebDriverWait explicitwait=new WebDriverWait(driver, Duration.ofSeconds(15));
	    
	    driver.get("https://www.shoppersstack.com/");
	    driver.findElement(By.xpath("//a[@id='electronics']")).click();
	    explicitwait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	    driver.findElement(By.linkText("//a[text()='Mobiles']")).click();
	    driver.findElement(By.xpath("//span[text()='MOBILE PHONE']")).click();
	    driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("411033");
	    explicitwait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	    
	    

	}

}
