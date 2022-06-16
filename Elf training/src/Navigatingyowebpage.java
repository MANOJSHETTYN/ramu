import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatingyowebpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//
		driver.navigate().to("http://demowebshop.tricentis.com/login/checkoutasguest?returnUrl=%2Fcart");//
		//driver.get("http://demowebshop.tricentis.com/login/checkoutasguest?returnUrl=%2Fcart");
		Thread.sleep(5000);
		driver.navigate().refresh();//click on any module
		driver.navigate().forward();//it will go forward button
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);

	}

}
