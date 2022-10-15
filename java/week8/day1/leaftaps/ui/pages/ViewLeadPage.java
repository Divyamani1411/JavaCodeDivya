package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftaps.ui.testcases.EditLead;
import leaftaps.ui.testcases.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage(RemoteWebDriver receivedDriver) {
		this.driver = receivedDriver;
	}

	public ViewLeadPage getLeadID() {
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		return this;
	}
public EditLeadPage clickEdit() {
	driver.findElement(By.linkText("Edit")).click();
	return new EditLeadPage(driver);
}
public DuplicateLeadPage clickDuplicateLead() {
	driver.findElement(By.linkText("Duplicate Lead")).click();
	return new DuplicateLeadPage(driver);
}
public LeadsPage clickDelete() {
	driver.findElement(By.linkText("Delete")).click();
	return new LeadsPage(driver);
}
}
