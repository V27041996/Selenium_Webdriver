package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		//Introducing new variable r
		WebElement r=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(r);
		//introducing new variable Ab
		WebElement Ab=driver.findElement(By.id("datepicker"));Ab.click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[7]/a")).click();
		System.out.println("calender Selected");
		
		/*driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.xpath("//*[@id=\"datePickerMonthYearInput\"]"));*/

	}
}
