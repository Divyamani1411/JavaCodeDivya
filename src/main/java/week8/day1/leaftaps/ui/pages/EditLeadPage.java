package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
public EditLeadPage(RemoteWebDriver receivedDriver) {
	this.driver=receivedDriver;
	PageFactory.initElements(driver,this);
}
@FindBy(how=How.ID,using="updateLeadForm_companyName")
private WebElement elementCompanyName;
@FindBy(how=How.NAME,using="submitButton")
private WebElement elementSubmitButton;
public EditLeadPage enterCompanyName() {
	elementCompanyName.sendKeys("TCS");
	return this;
}
public ViewLeadPage clickUpdate() {
	elementSubmitButton.click();
	return new ViewLeadPage(driver);
}
}
