package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.instagram.com/");
	    
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[name*='er']")).sendKeys("admin@123");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[name*='word']")).sendKeys("123456");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("button[class*='ap ']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("span[class*='ab3']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(" input[id*='email']")).sendKeys("ganu@12");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(" input[placeholder*='Password']")).sendKeys("755836");
	    

	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(" button[id*='loginbutton']")).click();
	    
	    Thread.sleep(2000);
	    //driver.findElement(By.cssSelector(" a[class*='7w']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(" a[class*='signup_btn'] ")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("  input[name*='firstname'] ")).sendKeys("rohit");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(" input[name*='lastname']  ")).sendKeys("sharma");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("  input[id*='0_g']  ")).sendKeys("7865993510");
	    

	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(" input[name*='pass']  ")).sendKeys("sharma@10");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(" select[name*='birthday_day'] ")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(" select[id*='month']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("select[id*='year']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("label[class*='8m']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("label[for*='0_5']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("label[for*='0_6_']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(" select[name*='rred_pro']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(" input[id*='0_q']")).sendKeys("female");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(" button[id*='0_s']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("  a[class*='_9bq5']")).click();   
	
	}

}
