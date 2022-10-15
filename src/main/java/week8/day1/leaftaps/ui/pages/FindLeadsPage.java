package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods {
	public FindLeadsPage(RemoteWebDriver receivedDriver) {
		this.driver = receivedDriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elementPhone;
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elementPhoneNumber;
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elementFindLeads;
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement elementFirstLead;
	public FindLeadsPage clickPhone() {
		elementPhone.click();
		return this;
	}

	public FindLeadsPage enterPhoneNumber(String phone) {
		elementPhoneNumber.sendKeys(phone);
		return this;
	}

	public ViewLeadPage clickFindLeadsButton() throws InterruptedException {
		elementFindLeads.click();
		Thread.sleep(2000);
		elementFirstLead.click();
		return new ViewLeadPage(driver);
	}
	/*
	 * public void enterLeadId(String leadID) {
	 * driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	 * driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); String
	 * text = driver.findElement(By.className("x-paging-info")).getText(); if
	 * (text.equals("No records to display")) { System.out.println("Text matched");
	 * } else { System.out.println("Text not matched"); }
	 */
}
