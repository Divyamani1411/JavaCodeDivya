package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {
	public LeadsPage(RemoteWebDriver receivedDriver) {
		this.driver=receivedDriver;
		}
public CreateLeadPage clickCreateLead() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage(driver);
}
public FindLeadsPage clickFindLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
	return new FindLeadsPage(driver);
}
}
