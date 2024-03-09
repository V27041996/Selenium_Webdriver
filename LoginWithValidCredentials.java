package Registration.MyShop;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginWithValidCredentials {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		//with valid username and password
		driver.findElement(By.id("email")).sendKeys("vinay.prudent278@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Sudha@123");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		String usertext = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
		System.out.println(usertext);
		if(usertext.contains("Welcome to your account. Here you can manage all of your personal information and orders."))
		{
		System.out.println("Login sucess");
		}
		else 
		{
		System.out.println("login not sucess");
		}
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		System.out.println("Login sucess");

	}

}
