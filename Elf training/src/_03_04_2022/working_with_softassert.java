package _03_04_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class working_with_softassert extends two_browser{
	@Test
	public void neglectminortest(){
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement registerlink = driver.findElement(By.className("ico-register"));
		
		SoftAssert ast = new SoftAssert();
		ast.assertEquals(registerlink.getText(),"Login", "testcase pass");
		
		registerlink.click();
		ast.assertAll();//if it is not there you will not get failures in console
	}

}
