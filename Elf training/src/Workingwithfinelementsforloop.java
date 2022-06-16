import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithfinelementsforloop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/books");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Conditions of Use']")).click();
		List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<radiobutton.size();i++){
			radiobutton.get(i).click();
		}
		/*WebElement e=driver.findElement(null);
		e.*/
	}

}
