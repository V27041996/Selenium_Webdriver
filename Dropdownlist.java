package VINDVG1.Vinay27;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownlist {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Select se=new Select (driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]")));
		List<WebElement> vs=se.getOptions();
		int Vinay=vs.size();
		//for(int i=0;i<Vinay;i++)
		//{
		//String options =vs.get(i).getText();
		//System.out.println(options);
	    //}
		for(int i=10;i<Vinay;i--)
		{
         String Options =vs.get(i).getText();
         System.out.println(Options);
        }
}
}
