package pack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import pack1.LoginPomClass;

public class TestBaseClass 
{
	WebDriver driver;
    @BeforeTest
	public void setup() 
	{
    	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "G:\\automation files\\chrome folder\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&ifkv=ARgdvAvhSuzuvpZKAFhXOcSLAQbJTL5h4d3wjACrdSAcj814ed7d0iiT7SsTDtrNoRTIaXKo9f6sPA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	LoginPomClass lp=new LoginPomClass(driver);
	lp.sendUsername();
	lp.clickonNextbutton();
	lp.sendpassword();
	lp.cliconnextButton();
	}
    
    @AfterMethod
    public void teardown() 
    {
    	driver.quit();
    }
    
	}
