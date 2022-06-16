import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class withoutcreatingobjecttarvellallindropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		for(int i=0;i<=5;i++){
		WebElement viewas = driver.findElement(By.id("products-orderby"));
		Select dropdown=new Select(viewas);
		dropdown.selectByIndex(i);
		
		}


	}

}
