import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithamazonabsolutexpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Softwares/chrome.exe");
WebDriver driver=new ChromeDriver();
driver.get("");
	}

}
