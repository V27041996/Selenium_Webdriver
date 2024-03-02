package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;
public class Dragdrop1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
	    
		// not working
		/*driver.findElement(By.id("droppableExample-tab-accept")).click();
		Actions Rcb=new Actions(driver);
		WebElement from=driver.findElement(By.id("acceptable"));
		WebElement to=driver.findElement(By.id("droppable"));
		Rcb.dragAndDrop(from, to).perform();
		System.out.println("Script sucess");*/
		
		//Code is working
		//driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();
		/*Actions Abc=new Actions(driver);
		WebElement from=driver.findElement(By.id("dragBox"));
		WebElement to=driver.findElement(By.id("notGreedyDropBox"));
		Abc.dragAndDrop(from, to).perform();
		System.out.println("Script sucess");*/
		
		
		// not working 
		/*driver.findElement(By.id("droppableExample-tab-revertable")).click();
		Actions RR=new Actions(driver);
		WebElement from=driver.findElement(By.id("revertable"));
		WebElement to=driver.findElement(By.id("droppable"));
		RR.dragAndDrop(from, to).perform();
		System.out.println("Script sucess");*/
	}

}
