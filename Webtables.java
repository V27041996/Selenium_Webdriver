package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Webtables {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();;
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		int nrows=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div/div")).size();
		System.out.println("Number of Rows:" +nrows);
		
		int ncol=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div")).size();
		System.out.println("Number of col:" +ncol);
		
		System.out.println("Script sucess");
	}
}