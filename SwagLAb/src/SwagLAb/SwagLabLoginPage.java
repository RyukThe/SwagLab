package SwagLAb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage
{
	@FindBy(xpath = "//input[@id='user-name']") private WebElement usename;
	@FindBy(xpath = "//input[@id='password']") private WebElement Pass;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement Login;
	
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpSwagLabLoginPageusername()
	{
		usename.sendKeys("standard_user");
	}
	
	public void inpSwagLabLoginPagepassword()
	{
		Pass.sendKeys("secret_sauce");
	}
	
	public void clickSwagLabLoginPagelogin() 
	{
		Login.click();
		
	}
}
