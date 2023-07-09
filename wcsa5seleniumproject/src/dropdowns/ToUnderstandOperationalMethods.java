package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOperationalMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	  
	     driver.get("file:///C:/Users/HP/Desktop/WCSA5/WebElement/MultiSelectDropdown.html");
	     
	     WebElement multiSelectDD = driver.findElement(By.id("menu"));
	     Select sel = new Select(multiSelectDD);
	     
	     //isMultiple Method
	     boolean result = sel.isMultiple();
         System.out.println(result);
         
         //getOptions Method Using for loop
        List<WebElement> dropDownOptions = sel.getOptions();
        for(int i=0;i<dropDownOptions.size();i++)
        {
          String options = dropDownOptions.get(i).getText();
          System.out.println(options);
          Thread.sleep(1000);
        }
        System.out.println();
        
        //getOptions method using for each loop
        List<WebElement> ops = sel.getOptions();
        for(WebElement we:ops)
        {
        	String textOfOps = we.getText();
        	System.out.println(textOfOps);
        }
        
        for(int i=2;i<=4;i++)
        {
        	sel.selectByIndex(i);
        }
        WebElement firstOption = sel.getFirstSelectedOption();
        System.out.println("First Selected Option Is :"+firstOption.getText());
         
	}

}