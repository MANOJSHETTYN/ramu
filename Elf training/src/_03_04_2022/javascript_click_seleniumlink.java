package _03_04_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_click_seleniumlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/java/technologies/downloads/#jdk18-windows");
		WebElement link = driver.findElement(By.xpath("(//a[@class='license-link icn-lock'])[3]"));
		link.click();
		WebElement link1 = driver.findElement(By.xpath("//a[text()='Download jdk-8u333-linux-arm32-vfp-hflt.tar.gz']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",link1);
		driver.quit();
	
	}

}
