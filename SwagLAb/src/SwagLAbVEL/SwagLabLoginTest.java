package SwagLAbVEL;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabLoginTest 
{
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		SwagLabLoginPage login=new SwagLabLoginPage(driver);
		login.enterUN();
		login.enterPWD();
		login.clickOnLoginBtn();
		
		Thread.sleep(3000);
		
		SwagLabHomePage home=new SwagLabHomePage(driver);
		home.verifyLogo();
		home.clickOnOpenMenu();
		
		Thread.sleep(3000);
		
		SwagLabMenuPage menu=new SwagLabMenuPage(driver);
		menu.clickOnLogoutBtn();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}