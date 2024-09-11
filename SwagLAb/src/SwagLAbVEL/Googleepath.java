package SwagLAbVEL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleepath
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();
	Thread.sleep(3000);
		
		driver.switchTo().frame("app");
		
		List<WebElement> w1 =driver.findElements(By.xpath("//ul[@class='LVal7b u4RcUd']/li"));
		String photos="Photos";
		for(WebElement w2:w1)
		{
			String sd = w2.getText();
			if(photos.equals(sd))
			{
				w2.click();
		
			}
		}
	
		
	}

}