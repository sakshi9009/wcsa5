package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     driver.get("file:///C:/Users/HP/Desktop/WCSA5/WebElement/MultiSelectDropdown.html");
	     WebElement multiSelectDD = driver.findElement(By.id("menu"));
	     
	     Select sel = new Select(multiSelectDD);
	     //To select using Index
	     sel.selectByIndex(1);
	     
	     //To Select by using visible Text
	     sel.selectByVisibleText("Paani Puri");
	     
	     //To Select using Value
	     sel.selectByValue("v3");

	}

}
