package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Handling_singlepopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Manoj");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Alert alert1=driver.switchTo().alert();
        Thread.sleep(2000);
        alert1.accept();
        Thread.sleep(2000);
        driver.quit();

}
}

