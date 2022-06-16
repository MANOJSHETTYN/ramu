package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closing_childwindow_getwindow_meth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> childwin = driver.getWindowHandles();
		System.out.println(childwin);
		for(String s:childwin){
			if(!(s.equals(parent))){
				driver.switchTo().window(s);
				}
			else{
				driver.switchTo().window(s);
				driver.close();
			}
		}
		//driver.findElement(By.xpath("//button[@id='windowButton']")).sendKeys(Keys.ENTER);
	}

}
