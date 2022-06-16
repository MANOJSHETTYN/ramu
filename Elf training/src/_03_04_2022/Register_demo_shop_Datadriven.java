package _03_04_2022;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register_demo_shop_Datadriven {
	@Test(dataProvider="TestData")
	public void Testcase(String gender,String Firstname,String Lastname,String email,String password,String Confirmpassword) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("ico-register")).click();
		if(gender.equals("male")){
			driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		}else{
			driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		}
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(Firstname);
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(Lastname);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(Confirmpassword);
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
           
		if(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed()){
			System.out.println("Pass: user logged in successfully");
		}

		else{
			System.out.println("Fail: User not logged in successfully");
		}

		driver.close();
	}




	@DataProvider(name="TestData",parallel=true)
	public Object[][] main() throws EncryptedDocumentException, IOException {
		return working_with_multipleread.data1("Register"); 
	}
}