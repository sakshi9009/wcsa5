package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/HP/Desktop/WCSA5/WebElement/SingleSelectDropdown.html");
		
		//identify DropDown on WebPage
		WebElement dropDownElement = driver.findElement(By.name("menu"));
		
		//handling the DropDown by creating object of select...
		 Select sel = new Select(dropDownElement);
		 
		 //read all the options of dropDown
		 List<WebElement> allOps = sel.getOptions();
		 //To read List Use Looping statements
		 for(WebElement op:allOps)
		 {
			 if(op.getText().equals("Paani Puri"))
			 {
				 Thread.sleep(2000);
				 op.click();
				 break;
			 }
		 }
		 

	}

}
