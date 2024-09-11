package SwagLAb17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage 
{
	@FindBy (xpath="//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement openmenu;
	
	public SwagLabHomePage(WebDriver o)
	{
		PageFactory.initElements(o, this);
	}
	
	public void verifySwagLabHomePagelogo()
	{
		boolean lo = logo.isDisplayed();
		
		if(lo==true)
		{
			System.out.println("logo is present ");
		}
		else
		{
			System.out.println("logo is not present");
		}
		
	}
	
	public void clickSwagLabHomePageopenmenu()
	{
		openmenu.click();
		
	}

}
