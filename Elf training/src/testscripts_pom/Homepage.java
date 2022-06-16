package testscripts_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Books')]")
	private WebElement booksLink;
	public void booksClick() {
		booksLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Computers')]")
	private WebElement computersLink;
	public void computersClick() {
		computersLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Electronics')]")
	private WebElement electronicsLink;
	public void electronicsClick() {
		electronicsLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Apparel')]")
	private WebElement apparalsLink;
	public void apparalsClick() {
		apparalsLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Digital downloads')]")
	private WebElement digitalDownloadsLink;
	public void digitalDownloadsClick() {
		digitalDownloadsLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Jewelry')]")
	private WebElement jewelryLink;
	public void jewelryClick() {
		jewelryLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Gift Cards')]")
	private WebElement giftCardsLink;
	public void giftCardsClick() {
		giftCardsLink.click();
	}
	public WebElement getBooksLink() {
		return booksLink;
	}
	public WebElement getComputersLink() {
		return computersLink;
	}
	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	public WebElement getApparalsLink() {
		return apparalsLink;
	}
	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}
	public WebElement getJewelryLink() {
		return jewelryLink;
	}
	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}
	public void setBooksLink(WebElement booksLink) {
		this.booksLink = booksLink;
	}
	public void setComputersLink(WebElement computersLink) {
		this.computersLink = computersLink;
	}
	public void setElectronicsLink(WebElement electronicsLink) {
		this.electronicsLink = electronicsLink;
	}
	public void setApparalsLink(WebElement apparalsLink) {
		this.apparalsLink = apparalsLink;
	}
	public void setDigitalDownloadsLink(WebElement digitalDownloadsLink) {
		this.digitalDownloadsLink = digitalDownloadsLink;
	}
	public void setJewelryLink(WebElement jewelryLink) {
		this.jewelryLink = jewelryLink;
	}
	public void setGiftCardsLink(WebElement giftCardsLink) {
		this.giftCardsLink = giftCardsLink;
	}

}


