package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox {

	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement search;
	
	@FindBy(xpath="(//li[@class='desktop-suggestion null'])[1]")
	private WebElement select;
	
	public SearchBox(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void searching(String d)
	{
		search.sendKeys(d);
	}
	public void selecting()
	{
		select.click();
	}
	
}	
