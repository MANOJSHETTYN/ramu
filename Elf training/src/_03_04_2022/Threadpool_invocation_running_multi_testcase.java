package _03_04_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Threadpool_invocation_running_multi_testcase {

	@Test(threadPoolSize=2,invocationCount=10)
	public void test() {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");
		
		driver.close();
		
	}

}
