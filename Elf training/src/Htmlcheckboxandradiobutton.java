import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlcheckboxandradiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/LocatorsPractice.html");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.className("username"));
		un.sendKeys("Shetty");
		WebElement pw = driver.findElement(By.className("password"));
		pw.sendKeys("password");
		WebElement checkbox = driver.findElement(By.className("checkbox"));
		checkbox.click();
		WebElement Maleradiobutton = driver.findElement(By.name("a"));
		Maleradiobutton.click();
		WebElement button = driver.findElement(By.className("button"));
		button.click();
	}

}
