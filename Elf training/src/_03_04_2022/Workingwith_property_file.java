package _03_04_2022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_property_file{

	public static String readprop(String URL) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/properties");
		Properties property=new Properties();
		property.load(fis);
		return property.getProperty("URL");
		

	}

}
