package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement username;
	
	public void sendUsername() 
	{
		username.sendKeys("7020220493");
	}
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement Nextbutton;
	
	public void clickonNextbutton() 
	{
		Nextbutton.click();
	}
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	public void sendpassword() 
	{
		password.sendKeys("9075755579");
	}
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement nextButton;
	
	public void cliconnextButton() 
	{
		nextButton.click();
	}
	
	public LoginPomClass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
