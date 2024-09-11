package SwagLAb14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabOpenMenuPage 
{
		@FindBy(xpath = "//a[text()='Logout']") private WebElement logout;
		
		public SwagLabOpenMenuPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		public void clickSwagLabOpenMenuPagelogout()
		{
			logout.click();
		}
}
