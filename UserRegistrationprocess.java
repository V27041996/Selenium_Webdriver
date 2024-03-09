package Registration.MyShop;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserRegistrationprocess {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email_create")).sendKeys("vinay.prudnt278@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Vinay");
		driver.findElement(By.id("customer_lastname")).sendKeys("Kumar");
		driver.findElement(By.id("passwd")).sendKeys("Sudha@123");
		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByValue("27");
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByValue("4");
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByValue("1996");
		driver.findElement(By.id("newsletter")).click();
	    driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	    String Usertext = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]")).getText();
	    System.out.println(Usertext);
	    if(Usertext.contains("Your account has been created."))
	    {
	    	System.out.println("User added");
	    }
	    else
	    {
	    	System.out.println("User not added");
	    }
		System.out.println("Registration Completed");
	}

}
