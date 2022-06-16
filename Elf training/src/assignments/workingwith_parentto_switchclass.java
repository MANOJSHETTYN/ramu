package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwith_parentto_switchclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/iframe.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//a[text()='INDIA']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		driver.quit();
	}

}
