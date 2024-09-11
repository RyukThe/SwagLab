package SwagLAb2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWAGLABTest
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver s= new ChromeDriver();
		s.get("https://www.saucedemo.com/");
		s.manage().window().maximize();
		s.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		SWAGLABLOGINPage log= new SWAGLABLOGINPage(s);
		log.username();
		log.password();
		log.loginbtn();
		
		Thread.sleep(2000);
		
		SWAGLABHOMEPagee home= new SWAGLABHOMEPagee(s);
		home.verifylog();
		home.menu();
		
		Thread.sleep(2000);
		
		SWAGLABMENUPage menu= new SWAGLABMENUPage(s);
		menu.logout();
		
		Thread.sleep(2000);
		s.close();
	}

}
