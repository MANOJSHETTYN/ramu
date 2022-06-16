package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class two_browser {
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openchrome(@Optional("chrome")String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		} else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
		}
	}
	@AfterClass
	public void closebrowser(){
		driver.close();	
		}

}
