package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	public WelcomePage(RemoteWebDriver receivedDriver) {
		this.driver = receivedDriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA")
	private WebElement elementclickCRMSFA;

	public HomePage clickCRMSFA() {
		elementclickCRMSFA.click();
		return new HomePage(driver);
	}

	public WelcomePage clickLogOut() {
		return this;
	}
}
