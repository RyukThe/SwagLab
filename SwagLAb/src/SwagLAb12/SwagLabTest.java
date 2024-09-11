package SwagLAb12;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SwagLabTest
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m = new ChromeDriver();
		
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		m.get("https://www.saucedemo.com/");
		
		
		SawgLabLoginPage n = new SawgLabLoginPage(m);
		n.inpSawgLabLoginPageusername();
		n.inpSawgLabLoginPagepass();
		n.clickSawgLabLoginPageloginbutton();
		Thread.sleep(2000);
		
		SwagLabHomePage f= new SwagLabHomePage(m);
		f.verifySwagLabHomePagelogo();
		f.clickSwagLabHomePageopenmenu();
		Thread.sleep(2000);
		
		SwagLabOpenMenuPage o= new SwagLabOpenMenuPage(m);
		o.clickSwagLabOpenMenuPagelogoutbtn();
		Thread.sleep(2000);
		
		m.close();
		
	}

}
