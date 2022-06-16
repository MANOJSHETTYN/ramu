import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workwithlinktextandpartiallinktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement Registerlink = driver.findElement(By.linkText("Register"));
		Registerlink.click();
		driver.navigate().back();
		WebElement Majortab = driver.findElement(By.partialLinkText("BOOKS"));
		Majortab.click();
	}

}
