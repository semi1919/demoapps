package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverregister extends creatPOM
{
  public  void main(String[] args)
  {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	  registerpage();
	
	


}
}