import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "./Softwares/ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	}

}
