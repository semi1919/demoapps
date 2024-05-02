package testNg;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class baseclass {
	WebDriver driver;
	@BeforeGroups
	public void bs()
	{
		System.out.println("this is before suit");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("this is before test");
	}
	@BeforeClass
	public void bc()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("this is before method");
	}
	@AfterTest
	public void at()
	{
		System.out.println("this is after test");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("this is after class");
	}
	@AfterSuite
	public void am()
	{
		System.out.println("this is after suit");
	}



}
