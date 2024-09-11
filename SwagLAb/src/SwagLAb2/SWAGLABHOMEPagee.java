package SwagLAb2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SWAGLABHOMEPagee 
{
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath="//button[text()='Open Menu']") private WebElement menu;
	
	public SWAGLABHOMEPagee(WebDriver obj)
	{
		PageFactory.initElements(obj, this);
	}
	
	
	public void verifylog() 
	{
		boolean verify = logo.isDisplayed();
		if(verify==true)
		{
			System.out.println("logo is present : verify ");
			
		}
		else
		{
			System.out.println("logo is not present");
		}
		
	
		
	}
	public void menu()
	{
		menu.click();
	}

}
