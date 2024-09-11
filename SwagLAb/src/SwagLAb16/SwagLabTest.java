package SwagLAb16;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


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

		Thread.sleep(2000);
		
		
		SwagLabOpenMenuPage menu= new  SwagLabOpenMenuPage(driver);
		menu.clickSwagLabOpenMenuPagelogout();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
