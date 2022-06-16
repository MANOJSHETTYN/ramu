package assignments;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_copypaste {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Manojshettyn");
		email.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		email.sendKeys(Keys.CONTROL+"c");
		email.sendKeys(Keys.CONTROL+"x");

		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		Thread.sleep(3000);
		pass.sendKeys(Keys.CONTROL+"v");
		//List<WebElement> pass = driver.findElements(By.xpath("//xj"));//you wont get any exception mistakes in xpath
		driver.quit();

}
	}

