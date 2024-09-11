package SwagLAb2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SWAGLABMENUPage 
{
	@FindBy (xpath = "//a[text()='Logout']") private WebElement logout;
	
	public SWAGLABMENUPage(WebDriver obj) 
	{
		PageFactory.initElements(obj, this);
	}
	
	public void logout() 
	{
		logout.click();
		
	}

}
