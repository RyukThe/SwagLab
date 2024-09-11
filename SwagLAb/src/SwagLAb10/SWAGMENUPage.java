package SwagLAb10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SWAGMENUPage 
{
	@FindBy (xpath = "//a[text()='Logout']") private WebElement logot;
	
	
	public SWAGMENUPage(WebDriver o) 
	{
		PageFactory.initElements(o, this);
	}
	
	
	public  void logot() 
	
	{
		logot.click();
		
	}

}

