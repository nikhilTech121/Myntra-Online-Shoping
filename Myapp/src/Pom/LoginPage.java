package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;



public class LoginPage extends BasePage
{

		@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconUser sprites-user']")
		private WebElement Loginclk;
	//declare for Login 
	@FindBy(xpath="(//a[@class='desktop-linkButton'])[2]")
	private WebElement LoginSign;
	//declare for username
	@FindBy(xpath="//input[@placeholder='Your Email Address']")
	private WebElement usen;
	//declare for pastfd
	@FindBy(xpath="//input[@placeholder='Enter Password']")
	private WebElement pswd;
	//declare for loginbtn
	@FindBy(xpath="//button[@class='login-login-button']")
	private WebElement logbtn;
	//Intilizing for all locator
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	//Utilization
	public void loginclk()
	{
		Loginclk.click();
	}
	public void loginclick()
	{
		LoginSign.click();
	}
	public void Username(String name)
	{
		usen.sendKeys(name);
	}
	public void Password(String pwd)
	{
		pswd.sendKeys(pwd);
	}
	public void LoginBtn()
	{
		logbtn.click();
	}
	
	
	
	
}
