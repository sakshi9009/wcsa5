package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    
	    driver.findElement(By.id("email")); WebElement pwd=driver.findElement(By.id("email"));
	    
	    pwd.sendKeys("qspider123");

	}

}
