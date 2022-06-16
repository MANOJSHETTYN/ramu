import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuitmethod {
	public static void main (String[] args){
		System.setProperty("webdriver.chrome.driver", "./Softwares/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login/checkoutasguest?returnUrl=%2Fcart");
		driver.manage().window().maximize();
		driver.quit();
	}

}
