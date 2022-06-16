package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googlemap_validation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/");
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']")).sendKeys("Bellary");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='directions-searchbox-0']/..//button[@data-tooltip='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@tooltip='Choose destination, or click on the map...']")).sendKeys("Vijaynagar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='directions-searchbox-1']/..//button[@data-tooltip='Search']")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//img[@id='section-directions-trip-travel-mode-0']")).isDisplayed()){
			System.out.println("pass: destination displayed");
		}
		else{
			System.out.println("fail");
		}

		

	}

}
////input[@spellcheck='false']