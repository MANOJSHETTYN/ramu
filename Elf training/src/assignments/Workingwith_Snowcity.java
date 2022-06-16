package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_Snowcity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snowcityblr.com/contact-us/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='icon navigate-icon']")).click();
		
	}

}
