package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement16 {//both click() and clear()

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//input[@autocomplete='off']"));
		e.sendKeys("manoj");
		Thread.sleep(3000);
		e.clear();
		WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
		driver.quit();
		
	}

}
