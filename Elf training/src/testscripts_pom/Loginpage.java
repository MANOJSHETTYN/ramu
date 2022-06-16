package testscripts_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement EmailTF;

	public void email_value(String email){
		EmailTF.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@class='password']")
	private WebElement PasswordTF;
	
	public void password_value(String password){
		PasswordTF.sendKeys(password);
	}
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement loginbutton;
	
	@FindBy(className="ico-logout")
	private WebElement logoutbutton;

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}

	public void setLogoutbutton(WebElement logoutbutton) {
		this.logoutbutton = logoutbutton;
	}

	public WebElement getEmailTF() {
		return EmailTF;
	}

	public WebElement getPasswordTF() {
		return PasswordTF;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setEmailTF(WebElement emailTF) {
		EmailTF = emailTF;
	}

	public void setPasswordTF(WebElement passwordTF) {
		PasswordTF = passwordTF;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}

	}

//}
