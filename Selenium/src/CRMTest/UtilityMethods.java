package CRMTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityMethods {
	
	
	public WebDriver Setup() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kunal/Downloads/chromedriver");
		WebDriver d= new ChromeDriver();
		return d;
	}

}
