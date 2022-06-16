package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class validation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"))).build().perform();
		act.click(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).build().perform();
	    WebElement addtocartbutton = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
	    addtocartbutton.click();
	    Thread.sleep(2000);
	    WebElement addtocartbutton1 = driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']"));
	    addtocartbutton1.click();
	    WebElement shoppingcart = driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
	    shoppingcart.click();
	    if(driver.findElement(By.xpath("(//input[@type='submit'])[2]")).isDisplayed()){
	    	System.out.println("pass");
	    }
	}

}
