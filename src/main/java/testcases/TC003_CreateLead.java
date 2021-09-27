package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="New Lead Creation";
		testNodes="Leads";
		category="Smoke";
		authors="Siva & Vithal";
		browserName="chrome";
		dataSheetName="TC003_CreateLead";
		}
		
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName, String pwd, String companyName,String firstName,String lastName) {
		
		//new CreateLeadPage()
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()		
		.clickCRMLink()
		.clickLeads()
		.clickCreateLead()		
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickSubmit()
		//.verifyPartialText(companyName);
		.verifyFirstName(firstName)
		.verifyLastName(lastName);
		
	}

}
