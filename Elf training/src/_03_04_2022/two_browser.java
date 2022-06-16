package _03_04_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class two_browser {
	WebDriver driver;
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)//pre condition
	public void openchrome(@Optional("edge")String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			driver=new ChromeDriver();
			
		} else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
			driver=new EdgeDriver();
		
		}
	}
	@AfterClass(alwaysRun=true)//post condition always run =true remove your wish 
	public void closebrowser(){
		driver.close();	
		}

}
