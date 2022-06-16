package _03_04_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeoptions_practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		
		
		option.addArguments("start-maximized");
		option.addArguments("--disable-notifications");
		option.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.easemytrip.com/");
		System.out.println("chromeoption is for settins only");
	}

}
