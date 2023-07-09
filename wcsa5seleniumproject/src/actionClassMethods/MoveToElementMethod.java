package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://www.bluestone.com");//Launch the bluestone application
		
		driver.findElement(By.id("denyBtn")).click();//handle the popup
		
		//driver.findElement(By.xpath("//a[contains(text(),'Watch Jewellery ')]")).click();
		
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch Jewellery ')]"));
		
		//To perform mouse actions on WebElement
		Actions act = new Actions(driver);
		
		//To perform mouseHover action
		act.moveToElement(target).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Band']")).click();

	}

}
