package SwagLAb6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SWAGlabLoginPage 
{
	@FindBy (xpath="//input[@id='user-name']") private WebElement username;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement login;
	
	public SWAGlabLoginPage(WebDriver ob )
	{
		PageFactory.initElements(ob, this);
		
	}
	
	public void username()
	{
		username.sendKeys("standard_user");
	}
	
	
	public void pass()
	{
		password.sendKeys("secret_sauce");
		
	}
	public void  login () 
	{
		login.click();
	}

}
