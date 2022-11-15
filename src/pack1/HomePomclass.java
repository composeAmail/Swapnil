package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePomclass
{
	WebDriver driver;
	
	@FindBy(xpath="")
	WebElement compose;
	
	public void clickoncompose() 
	{
		compose.click();
	}
	
	@FindBy(xpath="//input[@id=':g1']")
    WebElement to;
	
	public void sendto()
	{
		to.sendKeys("nilthorat.50@gmail.com");
	}
	
	@FindBy(xpath="//input[@id=':8e']")
    WebElement subject;
	
	public void sendsubject()
	{
		subject.sendKeys("Incubyte");
	}
	
	@FindBy(xpath="//div[@id=':77']")
    WebElement Message;
	
	public void sendMessage()
	{
		Message.sendKeys("Automation QA test for Incubyte");
	}
	
	@FindBy(xpath="//div[@id=':8o']")
    WebElement send;
	
	public void clickonsend()
	{
		send.click();
	}
	
	public HomePomclass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
