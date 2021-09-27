package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Create Lead']")
	private WebElement eleCreateLead;
	
	public CreateLeadPage clickCreateLead() {
		//WebElement eleUserName = locateElement("usernama");
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
	private WebElement findleads;
	
	public FindLeadsPage clickFindLeads() {
		click(findleads);
		return new FindLeadsPage();
	}
	

}
