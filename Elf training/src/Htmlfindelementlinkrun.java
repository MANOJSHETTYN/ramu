import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlfindelementlinkrun {

	public static void main(String[] args) throws InterruptedException {
           System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.get("file:///C:/Users/Admin/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/HTMLDemoPage.html");
           driver.manage().window().maximize();
           WebElement link = driver.findElement(By.tagName("a"));
           link.click();
           Thread.sleep(3000);
           driver.quit();
	}

}
