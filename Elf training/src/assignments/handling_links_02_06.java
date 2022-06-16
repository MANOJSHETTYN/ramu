package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_links_02_06 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Admin/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/iframe.html");
		Thread.sleep(5000);
		//driver.switchTo().frame(0);
		driver.switchTo().frame("frame1");//methodoverloading of frames
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='FR1']"))) ;
		driver.findElement(By.xpath("//a[@title='Entertainment News']")).click();
		

	}

}
