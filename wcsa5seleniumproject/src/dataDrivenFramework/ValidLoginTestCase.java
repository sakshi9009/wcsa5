package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://127.0.0.1:80/");
	    
	    //read the data from excel file and test the log in page
	    
	    Flib flib = new Flib();
	    
	    driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./Data/ActiTime.xlsx","validcreds", 1, 0));
	    driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./Data/ActiTime.xlsx","validcreds", 1, 1));
	    driver.findElement(By.id("loginButton")).click();
	    

	}

}
