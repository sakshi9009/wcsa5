package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:80/");
		
		//read the data from excel file and test the log in page
		FileInputStream fis = new FileInputStream("./Data/ActiTime.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String validUsername = cell.getStringCellValue();
		
		Thread.sleep(2000);
		
		FileInputStream fis2 = new FileInputStream("./Data/ActiTime.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis2);
		Sheet sheet1 = wb.getSheet("validcreds");
		Row row1 = sheet.getRow(1);
		Cell cell1 = row.getCell(0);
		String validPassword = cell.getStringCellValue();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(validUsername);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
	}

}
