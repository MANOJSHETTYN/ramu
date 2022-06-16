package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-to-word");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/Admin/Desktop/all/manoj shetty resume.pdf");
		//driver.quit();
	}

}
