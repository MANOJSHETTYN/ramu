import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class Printnamesofdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		WebElement viewas = driver.findElement(By.id("products-viewmode"));
		org.openqa.selenium.support.ui.Select dropdown=new org.openqa.selenium.support.ui.Select(viewas);
		List<WebElement> sort = dropdown.getOptions();
		for(WebElement mn:sort){
			System.out.println(mn.getText());
		}

	}

}
