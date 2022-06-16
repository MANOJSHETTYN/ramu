package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_closingmultipletabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> childwindow = driver.getWindowHandles();
		for(String a:childwindow){
			if(!a.equals(parentwindow)){
				driver.switchTo().window(a);
			}
		}
		//driver.findElement(By.xpath(xpathExpression))
		driver.findElement(By.xpath("//span[.='Register']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manojshetty");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("manojshettyn8@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Manoj@2580");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(parentwindow);
	    Thread.sleep(5000);
        
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Thread.sleep(5000);
		driver.quit();

		

	}

}
