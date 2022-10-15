package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import leaftaps.ui.testcases.EditLead;
import leaftaps.ui.testcases.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage(RemoteWebDriver receivedDriver) {
		this.driver = receivedDriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "viewLead_companyName_sp")
	private WebElement elementGetText;
	@FindBy(how = How.LINK_TEXT, using = "Edit")
	private WebElement elementEdit;
	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")
	private WebElement elementDuplicateLead;
	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement elementDelete;

	public ViewLeadPage getLeadID() {
		elementGetText.getText();
		return this;
	}

	public EditLeadPage clickEdit() {
		elementEdit.click();
		return new EditLeadPage(driver);
	}

	public DuplicateLeadPage clickDuplicateLead() {
		elementDuplicateLead.click();
		return new DuplicateLeadPage(driver);
	}

	public LeadsPage clickDelete() {
		elementDelete.click();
		return new LeadsPage(driver);
	}
}
