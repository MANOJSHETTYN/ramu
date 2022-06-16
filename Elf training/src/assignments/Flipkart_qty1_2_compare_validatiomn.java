package assignments;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_qty1_2_compare_validatiomn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
        Action sendesc = act.sendKeys(Keys.ESCAPE).build();
        sendesc.perform();
        String parent = driver.getWindowHandle();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("cello Butterflow Avengers Ball Pen  (Pack of 25, Blue)"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
        Thread.sleep(2000);
        Set<String> childwin = driver.getWindowHandles();
		System.out.println(childwin);
		for(String s:childwin){
			if(!(s.equals(parent))){
				driver.switchTo().window(s);
				}
		}
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
        driver.findElement(By.xpath("//div[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(2000);
        WebElement price_of_qty_1 = driver.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']"));
        System.out.println("The price of 1st qty is "+ price_of_qty_1.getText());
        driver.findElement(By.xpath("(//button[@class='_23FHuj'])[2]")).click();
        WebElement price_of_qty_2 = driver.findElement(By.xpath("(//span[@class='_2-ut7f _1WpvJ7'])"));
        System.out.println("The price of 2nd qty is"+ price_of_qty_2.getText());
        //driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        ////div[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a
        
	}
}


