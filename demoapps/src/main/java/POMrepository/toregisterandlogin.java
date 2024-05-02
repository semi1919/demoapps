package POMrepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toregisterandlogin {
	public static void main(String [] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		registerpage register= new registerpage(driver);
		register.registeruser("papa", "papa@gmail.com", "papa@123");
		
	}

}
