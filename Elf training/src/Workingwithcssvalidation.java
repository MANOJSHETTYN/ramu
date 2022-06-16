import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithcssvalidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		driver.findElement(By.cssSelector("input[class='email']")).sendKeys("game18061999@gmail.com");
		driver.findElement(By.cssSelector("input[class='password']")).sendKeys("Manoj@2580");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("book");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		try {
			if(driver.findElement(By.cssSelector("input[value='computer']")).isDisplayed()){
		
		
		
			System.out.println("Pass: Search is successfull");
		}
		}
		catch(NoSuchElementException e){
			System.out.println("fail:Search is unsuccessfull");
		}
		/*else{
			System.out.println("Fail: computer page is not displayed");
		}*/
		driver.close();


	}

}
