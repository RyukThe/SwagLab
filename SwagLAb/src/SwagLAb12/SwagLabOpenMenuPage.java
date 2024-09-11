package SwagLAb12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabOpenMenuPage 
{
	@FindBy(xpath = "//a[text()='Logout']") private WebElement logout;
	
	public SwagLabOpenMenuPage(WebDriver o) 
	{
		PageFactory.initElements(o, this);
	
	}
	
	
	public void clickSwagLabOpenMenuPagelogoutbtn() 
	{
		logout.click();
	}

}
