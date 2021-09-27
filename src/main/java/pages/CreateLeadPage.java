package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		
		PageFactory.initElements(driver,this);
		
		}
	
	
	
	
	
/*	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement clickCreateLead;
	
	public CreateLeadPage clickCreateLead(String data) {
		type(clickCreateLead,data);
		return this;
	}*/
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement companyName;
	
	public CreateLeadPage enterCompanyName(String data) {
		type(companyName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement firstName;
	
	public CreateLeadPage enterFirstName(String data) {
		type(firstName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement lastName;
	
	public CreateLeadPage enterLastName(String data) {
		type(lastName,data);
		return this;
	}

	
	@FindBy(how= How.CLASS_NAME,using="smallSubmit")
	private WebElement submitLead;
	
	public ViewLeadPage clickSubmit() {
		click(submitLead);
		return new ViewLeadPage();
	}

	
	}
