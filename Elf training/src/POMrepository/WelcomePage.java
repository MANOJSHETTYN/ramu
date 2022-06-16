package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);//webdriver,object return type
	}
	@FindBy(className="ico-register")
	WebElement registerlink;
	public void clickregister(){
		registerlink.click();
	}
	
	@FindBy(className="ico-login")
	WebElement loginlink;
	
	public void clicklogin(){
		loginlink.click();
	}

}
