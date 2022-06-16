import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_robot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/books");
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		//robo.keyPress(KeyEvent.

		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

}
