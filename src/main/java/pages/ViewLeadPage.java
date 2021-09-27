package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(how = How.ID, using = "viewLead_companyName_sp")
	private WebElement verifyCompanyName;

	public ViewLeadPage verifyCompanyName(String data) {
		verifyPartialText(verifyCompanyName, data);
		return this;
	}

	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	private WebElement verifyFirstName;

	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(verifyFirstName, data);
		return this;
	}

	@FindBy(how = How.ID, using = "viewLead_lastName_sp")
	private WebElement verifyLastName;

	public ViewLeadPage verifyLastName(String data) {
		verifyExactText(verifyLastName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//a[text()='Edit']")
	private WebElement clickedit;
	
	public EditLeadsPage clickEditButton() {
		click(clickedit);
		return new EditLeadsPage();
	}
	
	


	

}
