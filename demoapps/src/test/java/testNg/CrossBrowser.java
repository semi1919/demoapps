package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowser {
	@Test
	public void GoogleCross(String browser)
	{
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
	}

}
