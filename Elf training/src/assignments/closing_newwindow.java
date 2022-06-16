package assignments;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class closing_newwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle();
		driver.manage().window().maximize();
		WebElement facebooklink = driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
		facebooklink.click();
		Set<String> childwindow = driver.getWindowHandles();
		for(String s:childwindow){
			if(!(s.equals(parent))){
				driver.switchTo().window(s);
				driver.close();
			}
			/*else{
				driver.switchTo().window(s);
				driver.close();
			}*/
		}
	}

}


