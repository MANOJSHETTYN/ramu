import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class workingwith_rightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).contextClick().build().perform();
		//act.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).build().perform();
          act.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).build().perform();
          driver.quit();
	}

}
