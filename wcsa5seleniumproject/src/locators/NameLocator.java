package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    
	    driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    WebElement pwd=driver.findElement(By.name("password"));
	    pwd.sendKeys("qspider");

	}

}
