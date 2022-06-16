package Internetexplorer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Locators_class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver","./Softwares/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.amazon.com/");
	}

}
