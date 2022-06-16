package TestNG_advance_selenium_elf34;

import java.io.File;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;import com.relevantcodes.extentreports.model.ScreenCapture;

import generic.two_browser;

public class Extentreport  {
	static WebDriver driver;
	public static void main(String[] args) {
		LocalDateTime systemdate=LocalDateTime.now();
		String reportname = systemdate.toString().replaceAll(":", "-");

		ExtentReports report=new ExtentReports("./Reports/"+reportname+"Extentreport.html, true");
		ExtentTest test=report.startTest("ExtentDemo");//your wish pass any thing in parameter



		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/");

		test.log(LogStatus.INFO, "page is loaded");
		WebElement scroll = driver.findElement(By.xpath("//h5[text()='Marathahalli']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",scroll);

		test.log(LogStatus.INFO, "page is scrolled");
		test.log(LogStatus.INFO, test.addScreenCapture(screenshot()));//screenshot is a method name
		test.log(LogStatus.FATAL, "headeris not displayed");

		report.endTest(test);
		report.flush();
		driver.close();
	}

	public static String screenshot() {
		LocalDateTime systemdate=LocalDateTime.now();
		String screenshotname = systemdate.toString().replaceAll(":", "-");
		String impath1 = "../Screenshot"+screenshotname+".png";
		String impath = "./Screenshot"+screenshotname+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(impath);
		try{
			FileHandler.copy(temp, dest);
		}
		catch(Exception e){
			System.out.println("exception handler");
		}

		return impath1;		//or return "."+impath;
	}

}
