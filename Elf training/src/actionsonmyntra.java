import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsonmyntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=EAIaIQobChMIwbHa0r6J-AIVkTUrCh3krQELEAAYASAAEgILDvD_BwE");
		driver.manage().window().maximize();
		Actions mouse=new Actions(driver);
		mouse.moveToElement(driver.findElement(By.xpath("//a[@data-group='men']"))).build().perform();
		Thread.sleep(2000);
		mouse.click(driver.findElement(By.xpath("(//a[@class='desktop-categoryLink'])[1]"))).perform();
		driver.navigate().back();
		mouse.moveToElement(driver.findElement(By.xpath("(//a[@data-type='navElements'])"))).build().perform();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
