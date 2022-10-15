package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	public CreateLeadPage(RemoteWebDriver receivedDriver) {
		this.driver = receivedDriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using ="createLeadForm_companyName")
	private WebElement elementCompanyName;
	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement elementFirstName;
	@FindBy(how = How.ID, using ="createLeadForm_lastName")
	private WebElement elementLastName;
	@FindBy(how = How.NAME, using ="submitButton")
	private WebElement elementCreateLeadButton;

	public CreateLeadPage enterCompanyName(String CompanyName) {
		elementCompanyName.sendKeys(CompanyName);
		return this;

	}

	public CreateLeadPage enterFirstName(String FirstName) {
		elementFirstName.sendKeys(FirstName);
		return this;
	}

	public CreateLeadPage enterLastName(String lastname) {
		elementLastName.sendKeys(lastname);
		return this;
	}

	public ViewLeadPage clickCreateLeadButton() {
		elementCreateLeadButton.click();
		return new ViewLeadPage(driver);
	}
}
