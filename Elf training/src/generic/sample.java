package generic;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

class sample extends two_browser{
	 
	 @Test
	 public void tc(){
		 driver.manage().window().maximize();
		 driver.get("https://www.programiz.com/java-programming/arrays");
		 driver.close();
	 }
 }


   