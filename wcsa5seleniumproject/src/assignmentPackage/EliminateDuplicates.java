package assignmentPackage;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/HP/Desktop/WCSA5/WebElement/MultiDuplicateDopdown.html");
		
		//identify dropDown
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		//handle the dropDown
		Select sel = new Select(dropDownElement);
		
		HashSet<String> hs = new HashSet<String>();
		
		
		//To read options from dropDown
		List<WebElement> allOpts = sel.getOptions();
		
		//To read options from dropDown
		for(int i=0;i<allOpts.size();i++)
		{
			WebElement op = allOpts.get(i);
			
			//get Text of WebElment and add into set
			String value = op.getText();
			
			//add the value into set that means duplicates will not be allowed
			// insertion order won't be maintained
			hs.add(value);
		}
         //Read the value from set
		for(String element:hs)
		{
			Thread.sleep(2000);
			System.out.println(element);
		}
		
	}

}
