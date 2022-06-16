package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8073059780");
        driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("Manoj@2580");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("cello Butterflow Avengers Ball Pen  (Pack of 25, Blue)"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
        Thread.sleep(3000);
        WebElement price_in_flipkart= driver.findElement(By.xpath("(//div[text()='₹137'])[1]"));
        System.out.println("Price"+price_in_flipkart.getText());
        ////div[@id='container']
        driver.close();
        System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.amazon.in/");
        driver1.manage().window().maximize();
        driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("cello Butterflow Avengers Ball Pen  (Pack of 25, Blue)"+Keys.ENTER);
        Thread.sleep(2000);
        driver1.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
        WebElement price_qty2 = driver1.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        System.out.println(price_qty2.getText());
        //System.out.println(driver1.findElement(By.xpath("(//div[@class='a-box-inner'])[1]")).getAttribute("textContent"));

        
        //driver.close();

        }

}

