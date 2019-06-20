package CRMTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunManager {
    WebDriver d;
	
	@BeforeMethod
	public void OpenApplication() {
		UtilityMethods u=new UtilityMethods();
		d= u.Setup();
		d.get("https://freecrm.com/");
		
	}
	
	@Test
	public void TestPass() {
		System.out.println("Test Pass");
	}
}
