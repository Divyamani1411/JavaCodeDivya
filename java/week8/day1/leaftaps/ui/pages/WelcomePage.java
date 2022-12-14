package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	public WelcomePage(RemoteWebDriver receivedDriver) {
		this.driver=receivedDriver;
		}
public HomePage clickCRMSFA(){
	driver.findElement(By.linkText("CRM/SFA")).click();
	return new HomePage(driver);
}
public WelcomePage clickLogOut() {
	return this;
}
}
