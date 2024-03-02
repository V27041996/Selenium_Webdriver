package VINDVG1.Vinay27;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoRealtime {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://careers.ibm.com/apply/join/?job=19877973&utm_source=talentnetwork");
		System.out.println("Script success");

	}

}
