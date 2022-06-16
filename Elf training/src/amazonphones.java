import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazonphones {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
        WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
        wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")))).sendKeys("Phones");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
		//wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("(//span[text()='Samsung Galaxy S22 5G (Phantom White, 8GB, 128GB Storage) + Samsung Galaxy Buds 2']/../../../../../../..//a)[7]")).click();

	}

}
