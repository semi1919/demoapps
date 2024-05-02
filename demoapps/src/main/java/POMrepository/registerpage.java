package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage {
	
	public registerpage(WebDriver driver)
{	PageFactory.initElements(driver, this);}
	@FindBy(id="name")
	public WebElement nameTextfield;
	@FindBy(id="email")
	public WebElement emailTextfield;
	@FindBy(id="password")
	public WebElement passwordTextfield;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submitbutton;
	public void registeruser(String name, String email, String password)
	{
		nameTextfield.sendKeys(name);
		emailTextfield.sendKeys(email);
		passwordTextfield.sendKeys(password);
		submitbutton.click();
	}
}