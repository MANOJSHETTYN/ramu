package _03_04_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Edgedriver {
    static WebDriver driver;
	@BeforeTest
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.com/");
		
	}
}
