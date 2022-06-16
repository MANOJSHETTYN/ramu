import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlSendkeystextfield {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/SampleHTMLPage.html");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.tagName("input"));
		text.sendKeys("Testyantra");
		WebElement link = driver.findElement(By.tagName("a"));
		link.click();
		driver.quit();
	}

}
