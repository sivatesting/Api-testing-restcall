package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadsPage extends ProjectMethods{
	
	public EditLeadsPage() {
		PageFactory.initElements(driver,this);
		}
	
	

/*	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement clickCreateLead;
	
	public CreateLeadPage clickCreateLead(String data) {
		type(clickCreateLead,data);
		return this;
	}*/
	
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement newcompanyName;
	
	public EditLeadsPage enterNewCompanyName(String data) {
		type(newcompanyName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement newfirstName;
	
	public EditLeadsPage enterNewFirstName(String data) {
		type(newfirstName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement newlastName;
	
	public EditLeadsPage enterNewLastName(String data) {
		type(newlastName,data);
		return this;
	}

	
	@FindBy(how= How.XPATH,using="(//input[@name='submitButton'])[1]")
	private WebElement newsubmitLead;
	
	public ViewLeadPage clickSubmit() {
		click(newsubmitLead);
		return new ViewLeadPage();
	}

	
	}
