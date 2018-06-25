package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCard 
{
	@FindBy(xpath="(//a[@class='desktop-preHeaderLinks'])[1]")
	private WebElement gift;
	@FindBy(xpath="//span[@class='pic header-sprite icon-user']")
	private WebElement signin;
	@FindBy(xpath="//div[@class='button']")
	private WebElement log;
	
	
	public GiftCard(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gift()
	{
		gift.click();
		signin.click();
		//log.click();
	}
}
