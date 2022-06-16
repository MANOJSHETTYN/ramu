import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithregistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		if(title.contains("Demo")){
			System.out.println("Pass: Demo web shop is opened");
		}
		WebElement registerlink = driver.findElement(By.className("ico-register"));
		registerlink.click();
		String regi = driver.getTitle();
		if(regi.contains("Register")){
			System.out.println("pass: registration page is displayed");
		}
		driver.findElement(By.id("gender-male")).click();
		String firstname = "Manoj";
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		String lastname = "shetty";
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		String mail = "mas123@gmail.com";
		driver.findElement(By.id("Email")).sendKeys(mail);
		String password="Manoj@2580";
		driver.findElement(By.id("Password")).sendKeys(password);
		String confpassword = "Manoj@2580";
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confpassword);	
		driver.findElement(By.id("register-button")).click();
		if(driver.findElement(By.className("ico-logout")).isDisplayed()){//is displayed return type is boolean so this statement returntype is boolean
			System.out.println("Pass: Registration is pass");
		}
		driver.quit();
		
		
	}

}
