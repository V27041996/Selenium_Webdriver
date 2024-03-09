package SearchProductfeature;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BuyProduct {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement details = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		Sudha.moveToElement(details).perform();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a/span")).click();
		Thread.sleep(5000);
		Select size = new Select(driver.findElement(By.id("group_1")));
		size.selectByValue("3");
		driver.findElement(By.name("Orange")).click();
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
		
		
		/*driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		driver.findElement(By.id("firstname")).click();
		driver.findElement(By.id("lastname")).click();
		driver.findElement(By.id("address1")).sendKeys("Davangare-Bangalore");
		Sudha.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Sudha.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Sudha.sendKeys(Keys.TAB);
		driver.findElement(By.id("address2"));
		Sudha.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.id("city")).sendKeys("Davangere");
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByValue("5");
		driver.findElement(By.id("postcode")).sendKeys("00000");
		Select country = new Select(driver.findElement(By.id("id_country")));
		country.selectByValue("21");
		driver.findElement(By.id("phone")).sendKeys("9986078150");
		driver.findElement(By.id("phone_mobile")).sendKeys("9986078150");
		driver.findElement(By.id("other")).sendKeys("Demo order need to be placed for current address");
		driver.findElement(By.xpath("//*[@id=\"submitAddress\"]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();*/
		
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
		String confirmtext = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]")).getText();
		System.out.println(confirmtext);
		String confirmed = "Your order on My Shop is complete.";
		if(confirmtext.contains(confirmed))
		{
		System.out.println("Order confirmed");
		}
		else
		{
		System.out.println("order not confirmed");
		}
		System.out.println("Script sucess");
		
		
		

	}

}
