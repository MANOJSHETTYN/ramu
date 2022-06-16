package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class workingwithActions1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text.sendKeys("Computers");
		Actions action=new Actions(driver);
		action.sendKeys(text, Keys.ENTER).perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		//action.sendKeys(text, Keys.ENTER);
		driver.close();

	}

}
