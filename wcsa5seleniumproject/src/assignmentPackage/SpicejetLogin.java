package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpicejetLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("7688901120");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sagar@02");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(""));

	}
	
}
