package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class placeorders
{
	@FindBy(xpath="//button[.='PLACE ORDER']")
	private WebElement place;
	
	@FindBy(xpath="//input[@id='pincode']")
	private WebElement pin;
	
	@FindBy(xpath="//input[@id='locality']")
	private WebElement local;
		
	@FindBy(xpath="//input[@id='name']")
	private WebElement name;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement addre;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//div[@id='home']")
	private WebElement check;
		
	@FindBy(xpath="//button[@type='button']")
	private WebElement save;
	
	public placeorders(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void porder() throws InterruptedException
	{
		place.click();
		Thread.sleep(2000);
		
		}
	public void pinc(String pn)
	{
		pin.sendKeys(pn);
		
	}
	public void loc(String na, String nam)
	{
		local.sendKeys(na);
		name.sendKeys(nam);
	}
	public void address(String ad, String num)
	{
		addre.sendKeys(ad);
		mobile.sendKeys(num);
	}
	public void checks() throws InterruptedException
	{
		check.click();
		Thread.sleep(2000);
		save.click();
	}
}
