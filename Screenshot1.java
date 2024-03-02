package VINDVG1.Vinay27;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN1316G0&p=cadmaxx+solutions");
		driver.manage().window().maximize();
		File vsfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(vsfile,new File(".//screenshot/sap.png"));
		System.out.println("Scrpit sucess");

	}

}