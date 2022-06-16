import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithidforregis {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();

		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Manoj");
		driver.findElement(By.id("LastName")).sendKeys("shetty");
		driver.findElement(By.id("Email")).sendKeys("Hp18061999@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Manoj@2580");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Manoj@2580");
		driver.findElement(By.id("register-button")).click();

	}

}
