package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackOrder 
{
		@FindBy(xpath="(//a[@class='desktop-preHeaderLinks'])[2]")
		private WebElement trckoder;
		
		public TrackOrder(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			
		}
		
		public void track()
		{
			trckoder.click();
		}
}
