package _03_04_2022;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshot_perticularelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		WebElement popup = driver.findElement(By.xpath("//div[@class='eb_widget_welcome_text']"));
		if(popup.isDisplayed()){
			File temp = popup.getScreenshotAs(OutputType.FILE);
			File d=new File("./Screenshot/temp.png");
			try {
				FileHandler.copy(temp, d);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	}
}
