package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {
	public LeadsPage(RemoteWebDriver receivedDriver) {
		this.driver = receivedDriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	private WebElement elementCreateLead;
	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	private WebElement elementFindLeads;

	public CreateLeadPage clickCreateLead() {
		elementCreateLead.click();
		return new CreateLeadPage(driver);
	}

	public FindLeadsPage clickFindLeads() {
		elementFindLeads.click();
		return new FindLeadsPage(driver);
	}
}
