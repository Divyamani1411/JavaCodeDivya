package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods {
public DuplicateLeadPage(RemoteWebDriver receivedDriver) {
	this.driver=receivedDriver;
}
public ViewLeadPage clickCreateLeadButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
}
}
