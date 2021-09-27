package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class HomePage1 extends ProjectMethods{
	
	public HomePage1() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPage clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage();		
	}
	
	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Welcome')]]")
	private WebElement eleLoggedName;
	
	public HomePage1 verifyLoggedName(String data) {
	verifyPartialText(eleLoggedName, data);
		return this;		
	}
	

	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement crmsfalink;
	
	@Given ("Click on CRM/SFA link")
	public MyHomePage clickCRMLink() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(crmsfalink);
		return new MyHomePage();		
	}
	
	
	

}
