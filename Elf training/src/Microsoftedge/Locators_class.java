package Microsoftedge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators_class {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.com/");		
	}
}
