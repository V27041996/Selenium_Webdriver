package SearchProductfeature;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchingTheProduct {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Actions Sudha = new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email")).sendKeys("vinay.prudent278@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Sudha@123");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		WebElement womenstab = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		Sudha.moveToElement(womenstab).perform();
		driver.findElement(By.linkText("T-shirts")).click();
		String productname = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")).getText();
		System.out.println(productname);
		driver.findElement(By.id("search_query_top")).sendKeys("Faded Short Sleeve T-shirts");
		driver.findElement(By.name("submit_search")).click();
		String Searchresultname   = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText();
		System.out.println(Searchresultname);
		if(productname.equalsIgnoreCase(Searchresultname))
		{
		System.out.println("Product name matched test case failed");
		}
		else
		{
		System.out.println("Product name is not matched test case pass");
		}
		System.out.println("Product Search was Sucess");

	}

}
