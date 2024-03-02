package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Select ss=new Select(driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]")));
		//ss.selectByIndex(4);
		//ss.selectByIndex(5);
		//ss.selectByValue("7");
		//ss.selectByVisibleText("White");
		System.out.println("Sucess");
	}

}
