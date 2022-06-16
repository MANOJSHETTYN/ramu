import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithcssselector {

	public static void main(String[] args) {
                   System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
                   WebDriver driver=new ChromeDriver();
                   driver.get("file:///C:/Users/Admin/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/LocatorsPractice.html");
                   driver.manage().window().maximize();
                   driver.findElement(By.cssSelector("input[type='text']")).sendKeys("manoj shetty");
                   driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manoj");
                   driver.findElement(By.cssSelector("input[type='checkbox']")).click();
                   driver.findElement(By.cssSelector("input[type='radio']")).click();
                   driver.findElement(By.cssSelector("input[value='cancel']")).click();
                   driver.close();
	}

}
