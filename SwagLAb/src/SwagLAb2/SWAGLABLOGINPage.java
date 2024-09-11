package SwagLAb2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SWAGLABLOGINPage 
{
	@FindBy(xpath="//input[@id='user-name']") private WebElement UserName;
	@FindBy(xpath="//input[@id='password']") private WebElement Passowrd;
	@FindBy(xpath="//input[@id='login-button']") private WebElement Loginbutn;
	
	public SWAGLABLOGINPage(WebDriver obj) 
	{
		PageFactory.initElements(obj, this);
		
	}
	
	public void username() 
	{
		UserName.sendKeys("standard_user");
		
	}
	
	public void password()
	{
		Passowrd.sendKeys("secret_sauce");
	}
	
	public void loginbtn()
	{
		Loginbutn.click();
	}

}
