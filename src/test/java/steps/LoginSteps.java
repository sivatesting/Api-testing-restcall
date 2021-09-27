package steps;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;




public class LoginSteps {
	WebDriver driver;
	@Given("Launch the browser")
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
			
	}
	
	
	

	
	
	@Given("Launch Amazon Site")
	public void launchAmazonSite() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	
		driver.get("https://www.amazon.in/");
	}
	
	
	@And("Load the URL")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	}
	
	@FindBy(how = How.ID, using ="//span[text()='Hello, Sign in']")
	private WebElement signInMenu;
	
	@FindBy(how = How.CLASS_NAME, using ="test")
	private WebElement password;
	
	
	@FindBy(how = How.ID, using = "twotabsearchtextbox")
	private WebElement searchTextBox;
	
	@And("Search Products")
	public void searchProducts() {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(searchTextBox));
		
		signInMenu.click();
		
//		String parentWindow = driver.getWindowHandle();
//
//		
//		Iterator<String> windowIterator = driver.getWindowHandles().iterator();
//		String text="test";
//		while (windowIterator.hasNext()) {
//			String newWindow = windowIterator.next();
//			if (newWindow.contains(text)) {
//				driver.switchTo().window(newWindow);
//				break;
//			}
//			
//		}
//		
		
	
		
		driver.quit();
		
	}
	@And("Maximize the window")
	public void maxWindow() {
		driver.manage().window().maximize();
	}
	
	@And("Set the Implicit wait")
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
		 
	@And ("Enter the username as (.*)")
	public void enterUserName(String uName) {
//		driver.findElementById("username").sendKeys(uName);
		
	}	
	@And ("Enter the Password as (.*)")
	public void enterPassWord(String pwd) {
		
	//.findElementById("password").sendKeys(pwd);
	}
	
	@When ("Click on Login button")
	public void clickLogin() {
//		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then ("Login should be succeessful")
	public void loginSuccess() {
		System.out.println("Login successful");
	}
	
	}



