import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithfbcssselector {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait.
		WebElement signup = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		signup.click();
		String fn="Manoj";
		WebElement Firstname=driver.findElement(By.cssSelector("input[name='firstname']"));
		Firstname.sendKeys(fn);
		String ln="shetty";
		WebElement lastname=driver.findElement(By.cssSelector("input[name='lastname']"));
		lastname.sendKeys(ln);
		String mn="manojshettyn8@gmail.com";
		WebElement mobilenumber=driver.findElement(By.cssSelector("input[name='reg_email__']"));
		mobilenumber.sendKeys(mn);
		WebElement newpassword=driver.findElement(By.cssSelector("input[data-type='password']"));
		newpassword.sendKeys("Manoj@2580");
		WebElement signup1=driver.findElement(By.cssSelector("button[name='websubmit']"));
		signup1.click();
	}
	
	

}
