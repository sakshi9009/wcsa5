package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;

public class ScreenShotUsingExplicitTypeCasting {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.google.co.in/");
	    
	    //By Typecasting from WebDriver to TakeScreenshot 
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    
        File src = ts.getScreenshotAs(OutputType.FILE);
        
	    //("./PATH/NAME OF FOLDER.EXTENSION")
	    File dest = new File("./screenshots/goggle.jpg");
	    
	    Files.copy(src, dest);

	}

}
