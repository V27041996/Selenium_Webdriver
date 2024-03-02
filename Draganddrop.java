package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;


public class Draganddrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		//to maximize widows
		driver.manage().window().maximize();
		//Action class to using JS action on Objects
		Actions buil=new Actions(driver);
		WebElement from=driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.id("droppable"));
		
		//to perform actions
	    buil.dragAndDrop(from, to).perform();
		//buil.dragAndDropBy(from, 500, 150).perform();
		System.out.println("Script sucess");

	}

}
