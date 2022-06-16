package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		//WebElement dropdown = driver.findElement(By.id("products-orderby"));
		Select sortbydropdown=new Select(driver.findElement(By.xpath("(//option[@value='sel'])[1]")));
		sortbydropdown.selectByVisibleText("Audi");
		Thread.sleep(5000);
		Select sortbydropdown1=new Select(driver.findElement(By.xpath("(//option[@value='sel'])[1]")));
		sortbydropdown1.selectByVisibleText("BMW");
		Select sortbydropdown11=new Select(driver.findElement(By.xpath("(//option[@value='sel'])[1]")));
		sortbydropdown11.selectByVisibleText("Ford");
		Thread.sleep(5000);
		Select sortbydropdown111=new Select(driver.findElement(By.xpath("(//option[@value='sel'])[1]")));
		sortbydropdown111.selectByVisibleText("Honda");
		Thread.sleep(5000);
		Select sortbydropdown2=new Select(driver.findElement(By.xpath("(//option[@value='sel'])[1]")));
		sortbydropdown2.selectByVisibleText("Jaguar");
		Thread.sleep(5000);
		Select sortbydropdown3=new Select(driver.findElement(By.xpath("(//option[@value='sel'])[1]")));
		sortbydropdown3.selectByVisibleText("Land Rover");
		Thread.sleep(5000);
		Select sortbydropdown4=new Select(driver.findElement(By.xpath("(//option[@value='sel'])[1]")));
		sortbydropdown4.selectByVisibleText("Mini");
		Thread.sleep(5000);
		Select sortbydropdown5=new Select(driver.findElement(By.xpath("(//option[@value='sel'])[1]")));
		sortbydropdown5.selectByVisibleText("Mercedes");
		Thread.sleep(5000);
		Select sortbydropdown6=new Select(driver.findElement(By.xpath("(//option[@value='sel'])[1]")));
		sortbydropdown6.selectByVisibleText("Toyota");
		Thread.sleep(5000);
		Select sortbydropdown7=new Select(driver.findElement(By.xpath("(//option[@value='sel'])[1]")));
		sortbydropdown7.selectByVisibleText("Volvo");
		Thread.sleep(5000);
		Select sortbydropdown8=new Select(driver.findElement(By.xpath("(//option[@value='sel'])[1]")));
		sortbydropdown8.selectByVisibleText("Nissan");
		Thread.sleep(5000);
		Select sortbydropdown9=new Select(driver.findElement(By.xpath("(//option[@value='sel'])[1]")));
		sortbydropdown9.selectByVisibleText("Select a car");
		Thread.sleep(5000);
		




	}

}

