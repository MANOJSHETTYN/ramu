import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithaddtocartdemowebshop {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("BOOKS")).click();
        Thread.sleep(2000);//u have to use thread at a time it cant load 
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
        Thread.sleep(3000);
       
        driver.findElement(By.xpath("//span[@class='close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
        String text = driver.findElement(By.xpath("//table/tbody/tr/td[3]/a[.='Computing and Internet']")).getText();//same as isdigit()
        if(text.contains("Computing")){
        	System.out.println("Pass: success");
        }
        
        
	}

}
