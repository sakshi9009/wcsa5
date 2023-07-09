package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "./driver/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Desktop/WCSA5/WebElement/ConfirmationPopup.html");
		//to generate confirmation pop up
		driver.findElement(By.tagName("input")).click();
		//handle  confirmation pop up by using switchTo()
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		//al.accept();
		//al.dismiss();
		System.out.println(al.getText());
		al.accept();
		al.sendKeys("getText");
		

	}

}
