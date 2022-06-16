package testscripts_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register_page {

	public register_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@value='M']")
	private WebElement Male_radio_button;

	public void gender(String mradio_button){
		Male_radio_button.sendKeys(mradio_button);
	}
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement First_nameTF;

	public void FN_value(String Firstname){
		First_nameTF.sendKeys(Firstname);
	}
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement LastNameTF;

	public void LastName_value(String LastName){
		LastNameTF.sendKeys(LastName);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement EmailTF;

	public void Email_value(String Email){
		EmailTF.sendKeys(Email);
	}
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement PasswordTF;

	public void Password_value(String Password){
		PasswordTF.sendKeys(Password);
	}
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	private WebElement ConfirmPasswordTF;

	public void ConfirmPassword_value(String ConfirmPassword){
		ConfirmPasswordTF.sendKeys(ConfirmPassword);
	}
	
	@FindBy(xpath="//input[@id='register-button']")
	private WebElement rebutton;

	public void registerbutton(String registerbutton){
		rebutton.click();
	}

	public WebElement getMale_radio_button() {
		return Male_radio_button;
	}

	public WebElement getFirst_nameTF() {
		return First_nameTF;
	}

	public WebElement getLastNameTF() {
		return LastNameTF;
	}

	public WebElement getEmailTF() {
		return EmailTF;
	}

	public WebElement getPasswordTF() {
		return PasswordTF;
	}

	public WebElement getConfirmPasswordTF() {
		return ConfirmPasswordTF;
	}

	public WebElement getRebutton() {
		return rebutton;
	}

	public void setMale_radio_button(WebElement male_radio_button) {
		Male_radio_button = male_radio_button;
	}

	public void setFirst_nameTF(WebElement first_nameTF) {
		First_nameTF = first_nameTF;
	}

	public void setLastNameTF(WebElement lastNameTF) {
		LastNameTF = lastNameTF;
	}

	public void setEmailTF(WebElement emailTF) {
		EmailTF = emailTF;
	}

	public void setPasswordTF(WebElement passwordTF) {
		PasswordTF = passwordTF;
	}

	public void setConfirmPasswordTF(WebElement confirmPasswordTF) {
		ConfirmPasswordTF = confirmPasswordTF;
	}

	public void setRebutton(WebElement rebutton) {
		this.rebutton = rebutton;
	}
}
