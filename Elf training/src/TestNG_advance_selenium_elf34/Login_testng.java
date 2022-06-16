package TestNG_advance_selenium_elf34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_testng {
@Test
public void demo(){
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	driver.findElement(By.xpath("//input[@class='email']")).sendKeys("game18061999@gmail.com");
	driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Manoj@2580");
	driver.quit();

}
}
