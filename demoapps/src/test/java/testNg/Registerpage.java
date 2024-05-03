package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage
{
		Registerpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="name")
		public WebElement nametextfield;
		@FindBy(id="email")
		public WebElement emailtextfield;
		@FindBy(id="password")
		public WebElement passwordtextfield;
		@FindBy(xpath="//button[text()='Register']")
		public WebElement registerbutton;
		@FindBy(xpath="//div[text()='Registered successfully']")
		public WebElement registersuccessfully;
		
		public void registeruser(String name, String email, String Password)
		{
			nametextfield.sendKeys("ss");
			emailtextfield.sendKeys("ss@gmail.com");
			passwordtextfield.sendKeys("1234");
			registerbutton.click();
		}
		public boolean verifymsg()
		{
			return registersuccessfully.isDisplayed();
		}

		
	}