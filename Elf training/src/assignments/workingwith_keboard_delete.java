package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwith_keboard_delete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement serach = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		serach.sendKeys("manoj");
		Thread.sleep(3000);
		serach.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(3000);

		serach.sendKeys(Keys.BACK_SPACE);
		
	}

}
