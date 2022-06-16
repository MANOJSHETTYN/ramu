package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Handling_alertsof_doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
        Actions action=new Actions(driver);
        action.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).perform();;
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        driver.quit();
        
        
	}

}
