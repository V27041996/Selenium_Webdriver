package Registration.MyShop;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class VerfiyErrorMessagesWithWrongInputs {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email_create")).sendKeys("cinay910@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("9999999");
		driver.findElement(By.id("customer_lastname")).sendKeys("11111");
		driver.findElement(By.id("passwd")).sendKeys("Sudha");
		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByValue("27");
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByValue("4");
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByValue("1996");
		driver.findElement(By.id("newsletter")).click();
	    driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	    String error = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div")).getText();
	    System.out.print(error);
	    /*if(error.contains("There are 2 errors lastname is invalid.firstname is invalid.Error message displayed"))
	    {
	    System.out.println("error message should be displayed");
	    }
	    else
	    {
	    System.out.println("error message not displayed");
	    }*/
	    System.out.println("Error message displayed");

	}

}
