package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//store all the home page modules
	@FindBy(xpath="//div[.='Time-Track']/../descendant::img") private WebElement timeTrackModule;
	@FindBy(xpath="//div[text()='Tasks']/following-sibling::img") private WebElement taskModule;
	@FindBy(xpath="//div[text()='Reports']/following-sibling::img") private WebElement reportsModule;
	@FindBy(xpath="//div[text()='Users']/following-sibling::img") private WebElement usersModule;
	@FindBy(xpath="//div[text()='Work Schedule']/following-sibling::img") private WebElement workscheduleModule;
	@FindBy(xpath="//div[text()='Settings']/following-sibling::img") private WebElement settingsModule;
	@FindBy(xpath="//a[text()='Logout']") private WebElement logOutLink;
	
	//initialize
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}

	public WebElement getTaskModule() {
		return taskModule;
	}

	public WebElement getReportsModule() {
		return reportsModule;
	}

	public WebElement getUsersModule() {
		return usersModule;
	}

	public WebElement getWorkscheduleModule() {
		return workscheduleModule;
	}

	public WebElement getSettingsModule() {
		return settingsModule;
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	
	public void clickOntimeTrackModule()
	{
		timeTrackModule.click();
	}
	
	public void clickOntaskModule()
	{
		taskModule.click();
	}
	
	public void clickOnreportsModule()
	{
		reportsModule.click();
	}
	
	public void clickOnusersModule()
	{
		usersModule.click();
	}
	
	public void clickOnworkscheduleModule()
	{
		workscheduleModule.click();
	}
	
	public void clickOnsettingsModule()
	{
		settingsModule.click();
	}
	
	public void clickOnlogOutLink()
	{
		logOutLink.click();
	}
}
