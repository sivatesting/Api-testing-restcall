package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage() {
		PageFactory.initElements(driver,this);
		
		}
	
	

/*	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement clickCreateLead;
	
	public CreateLeadPage clickCreateLead(String data) {
		type(clickCreateLead,data);
		return this;
	}*/
	


		
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement leadid;
	
	public FindLeadsPage enterLeadID(String data) {
		type(leadid,data);
		return this;
	}



	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	private WebElement searchlead;
	
	public FindLeadsPage searchLead() {
		click(searchlead);
		return this;
	}

	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")
	private WebElement clicklead;
	
	public ViewLeadPage clickLead() {
		click(clicklead);
		return new ViewLeadPage();
	}
	


	
	}
