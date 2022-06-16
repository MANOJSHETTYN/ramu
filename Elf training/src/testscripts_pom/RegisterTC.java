package testscripts_pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMrepository.WelcomePage;
import _03_04_2022.Workingwith_property_file;
import _03_04_2022.working_with_multipleread;
import generic.two_browser;

public class RegisterTC extends two_browser{
    @Test(dataProvider="testData")
	public void TC_02(String Firstname,String Lastname,String gmail,String password) throws IOException {
    	driver.get(Workingwith_property_file.readprop("URL"));
    	WelcomePage welcome=new WelcomePage(driver);
    	welcome.clickregister();
    	
    	register_page register=new register_page(driver);
    	register.getMale_radio_button().click();
		
    	register.FN_value(Firstname);
		
    	register.LastName_value(Lastname);
    	
    	register.Email_value(gmail);
    	
    	register.Password_value(password);
    	
    	register.ConfirmPassword_value(password);
    	
    	register.getRebutton().click();
    }
    @DataProvider(name="testData")
    public static Object[][] data() throws   IOException{
    	return working_with_multipleread.data1("Register");
    }

}
