package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.ID,using="username")
	public WebElement eleUserName;
	//@Given ("Enter the username as (.*)")
	public LoginPage enterUserName(String data) {
		//WebElement eleUserName = locateElement("username");
		type(eleUserName, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	//@Given ("Enter the Password as (.*)")
	public LoginPage enterPassword(String data) {
		//WebElement elePassword = locateElement("password");
		type(elePassword, data);
		return this;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	//@Given ("Click on Login button")
	public HomePage1 clickLogIn() {
		click(eleLogin);
		return new HomePage1();		
	}
	
	public LoginPage clickLogInForFailer() {
		click(eleLogin);
		return this;		
	}
	
	@FindBy(how=How.ID,using="errorDiv")
	private WebElement eleErrorMsg;
	
	public LoginPage verifyErrorMsg(String data) {
	verifyPartialText(eleErrorMsg, data);
		return this;		
	}
	
	
	public HomePage1 loginSuccess() {
		System.out.println("Login Success");
			return new HomePage1();		
		}
		
}
