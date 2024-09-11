package SwagLAb4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWAGLABTest 

{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver n= new ChromeDriver();
		n.get("https://www.saucedemo.com/");
		n.manage().window().maximize();
		n.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 SWAGlabLoginPage login = new SWAGlabLoginPage(n);
		 login.username();
		 login.pass();
		 login.login();
		 
		 
		 Thread.sleep(2000);
		 
		 SWAGLABHomePage ho=new SWAGLABHomePage(n);
		 ho.logo();
		 ho.menu();
		 
		 Thread.sleep(2000);
		 
		 SWAGMENUPage m = new SWAGMENUPage(n);
		 m.logot();
		  Thread.sleep(2000);
		  
		  n.close();
		 
		 
		 
	}

}
