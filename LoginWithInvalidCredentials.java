package Registration.MyShop;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithInvalidCredentials {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		//with invalid username and password
		driver.findElement(By.id("email")).sendKeys("vinay.prudent278888888@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Sudha@1234");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		String error = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).getText();
		System.out.println(error);
		System.out.println("User not logged in to account");
		

	}

}
