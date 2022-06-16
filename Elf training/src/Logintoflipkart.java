import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logintoflipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8073059780");
        driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("Manoj@2580");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        driver.close();

        }

}
