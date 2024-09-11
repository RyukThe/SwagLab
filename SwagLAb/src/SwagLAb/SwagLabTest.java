package SwagLAb;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v104.runtime.model.WebDriverValue.Type;

public class SwagLabTest 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		SwagLabLoginPage login= new SwagLabLoginPage(driver);
		login.inpSwagLabLoginPageusername();
		login.inpSwagLabLoginPagepassword();
		login.clickSwagLabLoginPagelogin();

	
		
		Thread.sleep(2000);
		
		SwagLabHomePage home=new SwagLabHomePage(driver);
		home.verifySwagLabHomePagelogo();
		home.clickoSwagLabHomePagepenmenu();
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://meet.google.com/");
		Thread.sleep(2000);
		
		
		SwagLabOpenMenuPage menu= new  SwagLabOpenMenuPage(driver);
		menu.clickSwagLabOpenMenuPagelogout();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
