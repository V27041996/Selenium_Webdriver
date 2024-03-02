package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Actions Rcb=new Actions(driver);
		   
		// Enter the Full Name
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Vinay kumar Sp");
		        
		//Enter the Email
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("salkattevinay@gmail.com");
		        
		// Enter the Current Address
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("Davangare - Bangalore - Mysore");
		
		//Select the data
		Rcb.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Rcb.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		//hit the tab
		Rcb.sendKeys(Keys.TAB);
		
		//paste the address
		WebElement paddress=driver.findElement(By.id("permanentAddress"));
		Rcb.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		System.out.println("Script Sucess");
		
	}

}
