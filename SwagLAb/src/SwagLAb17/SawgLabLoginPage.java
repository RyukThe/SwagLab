package SwagLAb17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SawgLabLoginPage 
{
	@FindBy(xpath="//input[@id='user-name']") private WebElement Username;
	@FindBy (xpath ="//input[@id='password']") private WebElement pass ;
	@FindBy(xpath="//input[@id='login-button']") private WebElement login;
	
	public SawgLabLoginPage(WebDriver o)
	{
		PageFactory.initElements(o, this);
	}
	
	
	
	public void inpSawgLabLoginPageusername()
	{
		Username.sendKeys("standard_user");
	}
	
	public void inpSawgLabLoginPagepass()
	{
		pass.sendKeys("secret_sauce");
	}
	
	public void clickSawgLabLoginPageloginbutton()
	{
		login.click();
		
	}
}
