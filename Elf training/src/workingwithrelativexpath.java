import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithrelativexpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
		String Email="game18061999@gmail.com";
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys(Email);
		String Password="Manoj@2580";
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(Password);
		WebElement button = driver.findElement(By.xpath("//input[@value='Log in']"));
		button.click();
		try{
			
		
		if(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed()){
			System.out.println("Pass: User is successfully logged in");
		}
		}
		catch(NoSuchElementException e){
			System.out.println("Fail: user not logged in successfully");
		}
	}

}
