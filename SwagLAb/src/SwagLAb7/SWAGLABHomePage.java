package SwagLAb7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SWAGLABHomePage
{
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement menu;
	
	
	public SWAGLABHomePage(WebDriver o) 
	{
		PageFactory.initElements(o, this);
	}
	
	public void logo()
	{
		boolean log = logo.isDisplayed();
		if(log==true)
		{
			System.out.println("logo is present ");
		}
		else
		{
			System.out.println(" logo not found");
		}
		
	}
	
	public void menu() 
	{
		menu.click();
		
	}
	

}