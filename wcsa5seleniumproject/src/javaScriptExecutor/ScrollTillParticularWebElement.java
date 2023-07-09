package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
 
        WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
        
        //To perform Scrolling Operations for a newsElement
        //Location of newsElement
        Point loc = newsElement.getLocation();
        int xaxis = loc.getX();
        int yaxis = loc.getY();
        
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        //jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-180)+")");
        jse.executeScript("arguments[0].scrollIntoView(true)",newsElement);
	}

}
