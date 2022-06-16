import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithxpathtext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Wishlist']")).click();
		driver.close();
	}

}
