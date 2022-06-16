import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Workingwithdropdownbutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		//WebElement dropdown = driver.findElement(By.id("products-orderby"));
		Select sortbydropdown=new Select(driver.findElement(By.id("products-orderby")));
		sortbydropdown.selectByVisibleText("Name: A to Z");
		Thread.sleep(5000);
		Select sortbydropdown1=new Select(driver.findElement(By.id("products-orderby")));
		sortbydropdown1.selectByVisibleText("Name: Z to A");
		Thread.sleep(5000);
		Select sortbydropdown2=new Select(driver.findElement(By.id("products-orderby")));
		sortbydropdown2.selectByVisibleText("Price:Low to High");
		Thread.sleep(5000);
		Select sortbydropdown3=new Select(driver.findElement(By.id("products-orderby")));
		sortbydropdown3.selectByVisibleText("Price:High to Low");
		Thread.sleep(5000);



	}

}
