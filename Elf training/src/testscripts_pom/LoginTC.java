package testscripts_pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMrepository.WelcomePage;
import _03_04_2022.Workingwith_property_file;
import _03_04_2022.working_with_multipleread;
import generic.two_browser;

public class LoginTC extends two_browser{
	@Test(dataProvider="testData")
	public void TC_01(String email,String password) throws IOException{
		driver.get(Workingwith_property_file.readprop("URL"));
		WelcomePage welcome=new WelcomePage(driver);
		welcome.clicklogin();
		
		Loginpage login=new Loginpage(driver);
		
		login.email_value(email);
		
		login.password_value(password);
		
		login.getLoginbutton().click();
		
		try {
			if(login.getLogoutbutton().isEnabled()){
				Reporter.log("pass: login testcase", true);
			}
			
		} catch (Exception e) {
			
		}
		finally{
			login.getLogoutbutton().click();
		}
		
	}
	
	
	@DataProvider(name="testData")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		return working_with_multipleread.data1("Login");
	}

}
