package assignmentPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {

	//How to close only child browser
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("http://omayo.blogspot.com/");
			
			Thread.sleep(2000);
			
			//launch the child window		
			Thread.sleep(2000);
			WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
			
			Point elementLoc = childWindow.getLocation();
			int xaxis = elementLoc.getX();
			int yaxis = elementLoc.getY();
			
			//scroll till open a pop up window link
		    JavascriptExecutor jse = (JavascriptExecutor)driver;
		    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
		    	
		    childWindow.click();
		    
		  //get the address or handle of parent window
		    String parentHandle = driver.getWindowHandle();
		    
		    //get the address or handle of parent and child window
		    Set<String> allHandles = driver.getWindowHandles();
		    
		    //how to close only child browser
		    for(String wh:allHandles)
		    {
		    	if(!parentHandle.equals(wh))
		    	{
		    		Thread.sleep(2000);
		    		driver.switchTo().window(wh).close();
		    		break;
		    	}
		    }

	}

}
