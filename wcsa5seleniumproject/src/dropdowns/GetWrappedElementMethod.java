package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/HP/Desktop/WCSA5/WebElement/MultiSelectDropdown.html");
		
		//identify dropDown
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		//handle the dropDown
		Select sel = new Select(dropDownElement);
		
	//	List<WebElement> allOpts = sel.getOptions();
		
	//	for(WebElement op:allOpts)
	//	{
	//		System.out.println(op.getText());
	//	}
		
		//To read options from dropDown
		WebElement allOpts = sel.getWrappedElement();
		
		System.out.println(allOpts.getText());

	}

}
