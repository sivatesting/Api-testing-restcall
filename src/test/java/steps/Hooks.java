package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	
//	@Before
	public void before(Scenario sc) {
//		/*System.out.println(sc.getName());
//		System.out.println(sc.getId());*/
//		startResult();
//		startTestModule(sc.getName(), sc.getId());	
//		test = startTestCase(sc.getName());
//		test.assignCategory("Smoke");
//		test.assignAuthor("Siva");
//		startApp("chrome");	
//		
//	
	}
//	
	
//	@Before
//	public void before(Scenario sc) {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//				
//				ChromeOptions options = new ChromeOptions();
//				options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe");
//				
//				driver = new ChromeDriver(options);
//				driver.get("https://www.amazon.in/");
//	}
	
	@After
	public void after(Scenario sc) {
//		System.out.println(sc.getStatus());
//		System.out.println(sc.isFailed());
//		closeAllBrowsers();
//		endResult();
	}
//	
	
//	
//	@After
//	public void after(Scenario sc) {
//		driver.quit();
//	}
//	
	
	
	
	
	
	
	
	
	
	
}
