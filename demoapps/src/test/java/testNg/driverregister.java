package testNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverregister extends creatPOM
  {
	  WebDriver driver= new ChromeDriver();
	  {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	  creatPOM register=new creatPOM(driver);
	  register.registerpage(driver);
	  register.registeruser("ss", "ss@gmail.com", "1234");
	  register.verifymsg();
	  
  }}