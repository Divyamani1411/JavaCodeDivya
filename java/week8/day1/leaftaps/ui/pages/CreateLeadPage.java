package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	public CreateLeadPage(RemoteWebDriver receivedDriver) {
		this.driver=receivedDriver;
		}
public CreateLeadPage enterCompanyName(String CompanyName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
	return this;
	
}
public CreateLeadPage enterFirstName(String FirstName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
	return this;
}
public CreateLeadPage enterLastName(String lastname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	return this;
}
public ViewLeadPage clickCreateLead() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
}
}
