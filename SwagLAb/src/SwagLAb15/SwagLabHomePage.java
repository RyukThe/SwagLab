package SwagLAb15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage
{
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement OpenMenu;
	
	public SwagLabHomePage(WebDriver driver)//
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifySwagLabHomePagelogo()
	{
		
		boolean logo1 = logo.isDisplayed();
		if(logo1==true)
		{
			System.out.println("logo is present : pass");
		}
		else
		{
			System.out.println("logo is not present : fail");
		}
	}
	
	public void  clickoSwagLabHomePagepenmenu()
	{
		OpenMenu.click();
		
	}

}
