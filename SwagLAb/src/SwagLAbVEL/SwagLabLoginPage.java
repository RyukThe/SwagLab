package SwagLAbVEL;

//pom class 1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{
	//step1: declaration
	@FindBy(xpath="//input[@placeholder='Username']") private WebElement UN;            // private WebElement UN= driver.finElement(By.xpath(""));
	@FindBy(xpath="//input[@placeholder='Password']") private WebElement PWD;			 // private WebElement PWD= driver.finElement(By.xpath(""));
	@FindBy(xpath = "//input[@name='login-button']") private WebElement login;			 // private WebElement Login= driver.finElement(By.xpath(""));
	
	//step2: initialization
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);          //className.methodName(webDriverObject, thisKeyword);
	}
		
	//step3: usage	
	//enter UN
	public void enterUN() 
	{
		UN.sendKeys("standard_user");
	}
	
	public void enterPWD() 
	{
		PWD.sendKeys("secret_sauce");
	}
	
	public void clickOnLoginBtn() 
	{
		login.click();
	}
}