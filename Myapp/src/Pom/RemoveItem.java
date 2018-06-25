package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveItem {
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']")
	private WebElement bagclick;
	
	@FindBy(xpath="(//span[.='REMOVE'])[1]")
	private WebElement remove;
	
	@FindBy(xpath="//button[@class='btn primary-btn btn-remove m-button']")
	private WebElement removepop;
	
	
	public RemoveItem(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void Bag()
	{
		bagclick.click();
	}
	public void removeclk()
	{
		remove.click();
		//Actions s = new Actions(driver);
		//s.moveToElement(removepop).perform();
		}
	public void removefin()
	{
		removepop.click();
	}
}
