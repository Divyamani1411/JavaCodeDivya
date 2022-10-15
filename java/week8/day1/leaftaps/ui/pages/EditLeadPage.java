package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
public EditLeadPage(RemoteWebDriver receivedDriver) {
	this.driver=receivedDriver;
}
public EditLeadPage enterCompanyName() {
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	return this;
}
public ViewLeadPage clickUpdate() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
}
}
