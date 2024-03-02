package VINDVG1.Vinay27;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtablesdynamic1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	   
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> nrows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		System.out.println("Number of rows are:" +nrows.size());
		List<WebElement> ncol=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
		System.out.println("Number of col are:" +ncol.size());
		Thread.sleep(5000);
		
		driver.get("https://money.rediff.com/sectors");
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"dataTable\"]/tbody/tr/td[1]"));
		System.out.println("Number of rows:" +rows.size());
		List<WebElement> col=driver.findElements(By.xpath("//*[@id=\"dataTable\"]/tbody/tr[1]/td"));
		System.out.println("Number of Col:" +col.size());
		
		driver.get("https://money.rediff.com/indices");
		List<WebElement> r=driver.findElements(By.xpath("//*[@id=\"dataTable\"]/tbody/tr/td[1]"));
		System.out.println("Number of ROW:" +r.size());
		List<WebElement> c=driver.findElements(By.xpath("//*[@id=\"dataTable\"]/tbody/tr[1]/td"));
		System.out.println("Number of COL:" +c.size());
		System.out.println("Script Sucess");
		
		/*driver.get("http://demo.guru99.com/test/web-table-element.php"); 
		WebElement baseTable = driver.findElement(By.tagName("table"));
					  
		//To find third row of table
		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[1]"));
		String rowtext = tableRow.getText();
		System.out.println("Third row of table : "+rowtext);
				    
		 //to get 3rd row's 2nd column data
		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		String valueIneed = cellIneed.getText();
		System.out.println("Cell value is : " + valueIneed); 
		driver.close();*/
	}

}
